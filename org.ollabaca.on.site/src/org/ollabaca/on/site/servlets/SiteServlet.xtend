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
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.ollabaca.on.site.Activator
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.renderers.Renderers

/**
 * /site 							: home page
 * /site/pages/xxx 					: project page
 * /site/pages/xxx/topics/yyyy 		: topic page
 * /site/pages/xxx/types/aaaa		: type page
 *
 * @author 
 *
 */
class SiteServlet extends HttpServlet implements  IResourceChangeListener {
	
	public new() {
		ResourcesPlugin::workspace.addResourceChangeListener(this, IResourceChangeEvent::POST_CHANGE)
	}
	
	val Map<IProject, Resource> instances = Collections::synchronizedMap(new HashMap<IProject, Resource>());
	
	override protected doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var pathInfo = request.pathInfo
		if (pathInfo == null || pathInfo.equals("/")) {
			home(request, response)
			//return
		} else {
			val String[] names = pathInfo.substring(1).split("/")
			if (names.size == 2) {
				project(request, response, names.get(0), names.get(1))
			} else if ("topics".equals(names.get(2))) {
				topic(request, response, names.get(0), names.get(1), names.get(3))
			} else {
				type(request, response, names.get(0), names.get(1), names.get(3))				
			}
		}		
	}

	def home(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append(new HomePage().render());
	}
	
	def project(HttpServletRequest request, HttpServletResponse response, String path, String project) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Renderers::init(site)
			if (path == "pages") {
				response.getWriter().append(new ProjectPage(site).render)
			} else {
				Activator::instance.context.getSiteRenderer(path).render(site).fill(response)
			}
		} finally {
			Renderers::dispose
		}
	}
	
	def topic(HttpServletRequest request, HttpServletResponse response, String path, String project, String topic) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Renderers::init(site)
			var t = site.topics.filter[name == topic].head
			if (path == "pages") {
				response.getWriter().append(new TopicPage(site, t).render())	
			} else {
				Activator::instance.context.getTopicRenderer(path).render(t).fill(response)
			}
		} finally {
			Renderers::dispose
		}		
	}
	
	def type(HttpServletRequest request, HttpServletResponse response, String path, String project, String type) {
		var site = ResourcesPlugin::workspace.root.getProject(project).instances.allContents.filter(typeof(Site)).head
		try {
			Renderers::init(site)
			val topic = site.topics.findFirst[it.target.eClass.instanceClassName.equals(type)]
			var EClass eClass = topic.target.eClass
			
			if (path == "pages") {
				response.getWriter().append(new TypePage(site, eClass).render)
			} else {
				Activator::instance.context.getTypeRenderer(path).render(site, eClass).fill(response)
			}
		} finally {
			Renderers::dispose
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