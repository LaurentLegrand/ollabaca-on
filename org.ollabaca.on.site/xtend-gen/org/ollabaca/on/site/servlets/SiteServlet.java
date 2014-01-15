package org.ollabaca.on.site.servlets;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.SiteFactory;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.Workspace;
import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.Renderers;
import org.ollabaca.on.site.servlets.Page;
import org.ollabaca.on.site.util.Locales;
import org.ollabaca.on.site.util.Sites;

/**
 * /site 							: home page
 * /site/pages/xxx 					: project page
 * /site/pages/xxx/topics/yyyy 		: topic page
 * /site/pages/xxx/types/yyyy		: type page
 * /site/pages/xxx/tags/yyyy		: tag page
 * 
 * @author
 */
@SuppressWarnings("all")
public class SiteServlet extends HttpServlet implements IResourceChangeListener {
  public SiteServlet() {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    _workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
  }
  
  private final Workspace workspace = new Function0<Workspace>() {
    public Workspace apply() {
      Workspace _createWorkspace = SiteFactory.eINSTANCE.createWorkspace();
      return _createWorkspace;
    }
  }.apply();
  
  private final Map<IProject,Resource> instances = new Function0<Map<IProject,Resource>>() {
    public Map<IProject,Resource> apply() {
      HashMap<IProject,Resource> _hashMap = new HashMap<IProject, Resource>();
      Map<IProject,Resource> _synchronizedMap = Collections.<IProject, Resource>synchronizedMap(_hashMap);
      return _synchronizedMap;
    }
  }.apply();
  
  protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
    try {
      Locale _locale = request.getLocale();
      Locales.set(_locale);
      String pathInfo = request.getPathInfo();
      boolean _or = false;
      boolean _equals = Objects.equal(pathInfo, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = pathInfo.equals("/");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        this.home(request, response);
      } else {
        String _substring = pathInfo.substring(1);
        final String[] names = _substring.split("/");
        int _size = ((List<String>)Conversions.doWrapArray(names)).size();
        boolean _equals_2 = (_size == 2);
        if (_equals_2) {
          String _get = names[0];
          String _get_1 = names[1];
          this.site(request, response, _get, _get_1);
        } else {
          Object _get_2 = names[2];
          boolean _equals_3 = "topics".equals(_get_2);
          if (_equals_3) {
            String _get_3 = names[0];
            String _get_4 = names[1];
            String _get_5 = names[3];
            this.topic(request, response, _get_3, _get_4, _get_5);
          } else {
            Object _get_6 = names[2];
            boolean _equals_4 = "tags".equals(_get_6);
            if (_equals_4) {
              String _get_7 = names[0];
              String _get_8 = names[1];
              String _get_9 = names[3];
              this.tag(request, response, _get_7, _get_8, _get_9);
            } else {
              String _get_10 = names[0];
              String _get_11 = names[1];
              String _get_12 = names[3];
              this.type(request, response, _get_10, _get_11, _get_12);
            }
          }
        }
      }
    } finally {
      Locales.unset();
    }
  }
  
  public PrintWriter home(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    PrintWriter _writer = response.getWriter();
    CharSequence _page_Element = Page.page_Element(this.workspace);
    PrintWriter _append = _writer.append(_page_Element);
    return _append;
  }
  
  public PrintWriter site(final HttpServletRequest request, final HttpServletResponse response, final String path, final String project) {
    try {
      PrintWriter _xblockexpression = null;
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        IProject _project = _root.getProject(project);
        Resource _instances = this.getInstances(_project);
        TreeIterator<EObject> _allContents = _instances.getAllContents();
        Iterator<Site> _filter = Iterators.<Site>filter(_allContents, Site.class);
        Site site = IteratorExtensions.<Site>head(_filter);
        PrintWriter _xtrycatchfinallyexpression = null;
        try {
          PrintWriter _xblockexpression_1 = null;
          {
            Sites.current.set(site);
            PrintWriter _xifexpression = null;
            boolean _equals = Objects.equal(path, "pages");
            if (_equals) {
              PrintWriter _writer = response.getWriter();
              CharSequence _page_Element = Page.page_Element(site);
              PrintWriter _append = _writer.append(_page_Element);
              _xifexpression = _append;
            } else {
              Content _render = Renderers.siteRenderers.render(path, site);
              _render.fill(response);
            }
            _xblockexpression_1 = (_xifexpression);
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          Sites.current.set(null);
        }
        _xblockexpression = (_xtrycatchfinallyexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public PrintWriter topic(final HttpServletRequest request, final HttpServletResponse response, final String path, final String project, final String topic) {
    try {
      PrintWriter _xblockexpression = null;
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        IProject _project = _root.getProject(project);
        Resource _instances = this.getInstances(_project);
        TreeIterator<EObject> _allContents = _instances.getAllContents();
        Iterator<Site> _filter = Iterators.<Site>filter(_allContents, Site.class);
        Site site = IteratorExtensions.<Site>head(_filter);
        PrintWriter _xtrycatchfinallyexpression = null;
        try {
          PrintWriter _xblockexpression_1 = null;
          {
            Sites.current.set(site);
            EList<Topic> _topics = site.getTopics();
            final Function1<Topic,Boolean> _function = new Function1<Topic,Boolean>() {
              public Boolean apply(final Topic it) {
                String _name = it.getName();
                boolean _equals = Objects.equal(_name, topic);
                return Boolean.valueOf(_equals);
              }
            };
            Iterable<Topic> _filter_1 = IterableExtensions.<Topic>filter(_topics, _function);
            Topic t = IterableExtensions.<Topic>head(_filter_1);
            PrintWriter _xifexpression = null;
            boolean _equals = Objects.equal(path, "pages");
            if (_equals) {
              PrintWriter _writer = response.getWriter();
              CharSequence _page_Element = Page.page_Element(t);
              PrintWriter _append = _writer.append(_page_Element);
              _xifexpression = _append;
            } else {
              Content _render = Renderers.topicRenderers.render(path, t);
              _render.fill(response);
            }
            _xblockexpression_1 = (_xifexpression);
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          Sites.current.set(null);
        }
        _xblockexpression = (_xtrycatchfinallyexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public PrintWriter type(final HttpServletRequest request, final HttpServletResponse response, final String path, final String project, final String type) {
    try {
      PrintWriter _xblockexpression = null;
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        IProject _project = _root.getProject(project);
        Resource _instances = this.getInstances(_project);
        TreeIterator<EObject> _allContents = _instances.getAllContents();
        Iterator<Site> _filter = Iterators.<Site>filter(_allContents, Site.class);
        Site site = IteratorExtensions.<Site>head(_filter);
        PrintWriter _xtrycatchfinallyexpression = null;
        try {
          PrintWriter _xblockexpression_1 = null;
          {
            Sites.current.set(site);
            EList<Type> _types = site.getTypes();
            final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
              public Boolean apply(final Type it) {
                String _name = it.getName();
                boolean _equals = Objects.equal(_name, type);
                return Boolean.valueOf(_equals);
              }
            };
            Iterable<Type> _filter_1 = IterableExtensions.<Type>filter(_types, _function);
            Type t = IterableExtensions.<Type>head(_filter_1);
            PrintWriter _xifexpression = null;
            boolean _equals = Objects.equal(path, "pages");
            if (_equals) {
              PrintWriter _writer = response.getWriter();
              CharSequence _page_Element = Page.page_Element(t);
              PrintWriter _append = _writer.append(_page_Element);
              _xifexpression = _append;
            } else {
              Content _render = Renderers.typeRenderers.render(path, t);
              _render.fill(response);
            }
            _xblockexpression_1 = (_xifexpression);
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          Sites.current.set(null);
        }
        _xblockexpression = (_xtrycatchfinallyexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public PrintWriter tag(final HttpServletRequest request, final HttpServletResponse response, final String path, final String project, final String tag) {
    try {
      PrintWriter _xblockexpression = null;
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        IProject _project = _root.getProject(project);
        Resource _instances = this.getInstances(_project);
        TreeIterator<EObject> _allContents = _instances.getAllContents();
        Iterator<Site> _filter = Iterators.<Site>filter(_allContents, Site.class);
        Site site = IteratorExtensions.<Site>head(_filter);
        PrintWriter _xtrycatchfinallyexpression = null;
        try {
          PrintWriter _xblockexpression_1 = null;
          {
            Sites.current.set(site);
            EList<Tag> _tags = site.getTags();
            final Function1<Tag,Boolean> _function = new Function1<Tag,Boolean>() {
              public Boolean apply(final Tag it) {
                String _name = it.getName();
                boolean _equals = Objects.equal(_name, tag);
                return Boolean.valueOf(_equals);
              }
            };
            Iterable<Tag> _filter_1 = IterableExtensions.<Tag>filter(_tags, _function);
            Tag t = IterableExtensions.<Tag>head(_filter_1);
            PrintWriter _xifexpression = null;
            boolean _equals = Objects.equal(path, "pages");
            if (_equals) {
              PrintWriter _writer = response.getWriter();
              CharSequence _page_Element = Page.page_Element(t);
              PrintWriter _append = _writer.append(_page_Element);
              _xifexpression = _append;
            } else {
              _xifexpression = null;
            }
            _xblockexpression_1 = (_xifexpression);
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          Sites.current.set(null);
        }
        _xblockexpression = (_xtrycatchfinallyexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Resource getInstances(final IProject project) {
    Resource resource = this.instances.get(project);
    boolean _notEquals = (!Objects.equal(resource, null));
    if (_notEquals) {
      return resource;
    }
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSet set = _resourceSetImpl;
    String _name = project.getName();
    String _format = String.format("/%s/src-gen/instances.xmi", _name);
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_format, true);
    Resource _resource = set.getResource(_createPlatformResourceURI, true);
    resource = _resource;
    this.instances.put(project, resource);
    return resource;
  }
  
  public void resourceChanged(final IResourceChangeEvent event) {
    Set<IProject> _keySet = this.instances.keySet();
    ArrayList<IProject> _arrayList = new ArrayList<IProject>(_keySet);
    for (final IProject p : _arrayList) {
      IResourceDelta _delta = event.getDelta();
      String _name = p.getName();
      String _format = String.format("%s/src-gen/instances.xmi", _name);
      Path _path = new Path(_format);
      IResourceDelta _findMember = _delta.findMember(_path);
      boolean _notEquals = (!Objects.equal(_findMember, null));
      if (_notEquals) {
        String _plus = (this + ": ");
        String _plus_1 = (_plus + p);
        String _plus_2 = (_plus_1 + ": changed");
        System.out.println(_plus_2);
        Resource _remove = this.instances.remove(p);
        ResourceSet _resourceSet = _remove.getResourceSet();
        EList<Resource> _resources = _resourceSet.getResources();
        final Procedure1<Resource> _function = new Procedure1<Resource>() {
          public void apply(final Resource it) {
            it.unload();
          }
        };
        IterableExtensions.<Resource>forEach(_resources, _function);
      }
    }
  }
}
