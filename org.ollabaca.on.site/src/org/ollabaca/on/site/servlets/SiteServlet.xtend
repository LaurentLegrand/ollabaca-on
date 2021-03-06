package org.ollabaca.on.site.servlets

import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.Map
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.renderers.Renderers
import org.ollabaca.on.site.util.Locales
import org.ollabaca.on.site.util.Sites
import org.ollabaca.on.site.Workspace
import org.ollabaca.on.site.SiteFactory

/**
 * /site 							: home page
 * /site/pages/xxx 					: project page
 * /site/pages/xxx/topics/yyyy 		: topic page
 * /site/pages/xxx/types/yyyy		: type page
 * /site/pages/xxx/tags/yyyy		: tag page
 *
 * @author 
 *
 */
class SiteServlet extends HttpServlet implements  IResourceChangeListener {
	
	public new() {
		ResourcesPlugin::workspace.addResourceChangeListener(this, IResourceChangeEvent::POST_CHANGE)
		//Sites::site.register(typeof(EClass), [current.get()])
	}
	
	val Workspace workspace = SiteFactory::eINSTANCE.createWorkspace
	
	val Map<IProject, Resource> instances = Collections::synchronizedMap(new HashMap<IProject, Resource>());
	
	override protected doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Locales::set(request.locale)
			var pathInfo = request.pathInfo
			if (pathInfo == null || pathInfo.equals("/")) {
				home(request, response)
				//return
			} else {
				val String[] names = pathInfo.substring(1).split("/")
				if (names.size == 2) {
					site(request, response, names.get(0), names.get(1))
				} else if ("topics".equals(names.get(2))) {
					topic(request, response, names.get(0), names.get(1), names.get(3))
				} else if ("tags".equals(names.get(2))) {
					tag(request, response, names.get(0), names.get(1), names.get(3))
				}
				else {
					type(request, response, names.get(0), names.get(1), names.get(3))				
				}
			}
		} finally {
			Locales::unset
		}
	}
	
	def home(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append(Page::page_Element(workspace))
	}
	
	def site(HttpServletRequest request, HttpServletResponse response, String path, String project) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Sites::current.set(site)
			if (path == "pages") {
				response.getWriter().append(Page::page_Element(site))
			} else {
				Renderers::siteRenderers.render(path, site).fill(response)
			}
		} finally {
			Sites::current.set(null)
		}
	}
	
	def topic(HttpServletRequest request, HttpServletResponse response, String path, String project, String topic) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Sites::current.set(site)
			var t = site.topics.filter[name == topic].head
			if (path == "pages") {
				response.getWriter().append(Page::page_Element(t))
			} else {
				Renderers::topicRenderers.render(path, t).fill(response)
			}
		} finally {
			Sites::current.set(null)
		}		
	}
	
	def type(HttpServletRequest request, HttpServletResponse response, String path, String project, String type) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Sites::current.set(site)
			var t = site.types.filter[name == type].head
			
			if (path == "pages") {
				response.getWriter().append(Page::page_Element(t))
			} else {
				Renderers::typeRenderers.render(path, t).fill(response)
			}
		} finally {
			Sites::current.set(null)
		}		
	}
	
	def tag(HttpServletRequest request, HttpServletResponse response, String path, String project, String tag) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Sites::current.set(site)
			var t = site.tags.filter[name == tag].head
			if (path == "pages") {
				response.getWriter().append(Page::page_Element(t))
			} else {
//				Activator::instance.context.getTagRenderer(path).render(t).fill(response)
			}
		} finally {
			Sites::current.set(null)
		}		
	}

	def Resource getInstances(IProject project) {
		var Resource resource = this.instances.get(project);
		if (resource != null) {
			return resource;
		}
		val ResourceSet set = new ResourceSetImpl();
		resource = set.getResource(URI::createPlatformResourceURI(String::format("/%s/src-gen/instances.xmi", project.getName()), true), true);
		this.instances.put(project, resource);
		return resource;
	}


	override resourceChanged(IResourceChangeEvent event) {
		for (p: new ArrayList<IProject>(this.instances.keySet)) {
			
			if (event.delta.findMember(new Path(String::format("%s/src-gen/instances.xmi", p.name))) != null) {
				System::out.println(this + ": " + p + ": changed")
				this.instances.remove(p).resourceSet.resources.forEach[unload]
			}
		}
	}		
}