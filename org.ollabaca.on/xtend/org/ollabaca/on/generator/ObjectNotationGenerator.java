package org.ollabaca.on.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.ollabaca.on.generator.ProjectToXmi;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.tools.SiteToHtml;
import org.ollabaca.on.util.Visitor;

@SuppressWarnings("all")
public class ObjectNotationGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      boolean _not = (!(fsa instanceof IFileSystemAccessExtension2));
      if (_not) {
        System.out.println("ERROR: not instanceof FSAExt2");
        return;
      }
      ResourceSet resourceSet = resource.getResourceSet();
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      URI _uRI = resource.getURI();
      String _platformString = _uRI.toPlatformString(true);
      Path _path = new Path(_platformString);
      IFile _file = _root.getFile(_path);
      IProject project = _file.getProject();
      Visitor _visitor = new Visitor();
      Visitor visitor = _visitor;
      IFolder _folder = project.getFolder("src");
      _folder.accept(visitor);
      Collection<IFile> _files = visitor.getFiles();
      for (final IFile file : _files) {
        {
          IPath _fullPath = file.getFullPath();
          String _plus = ("LOAD: " + _fullPath);
          System.out.println(_plus);
          IPath _fullPath_1 = file.getFullPath();
          String _string = _fullPath_1.toString();
          URI _createPlatformResourceURI = URI.createPlatformResourceURI(_string, true);
          resourceSet.getResource(_createPlatformResourceURI, true);
        }
      }
      URI all = ((IFileSystemAccessExtension2) fsa).getURI("all.xmi");
      Factory _factory = Registry.INSTANCE.getFactory(all);
      Resource _createResource = _factory.createResource(all);
      XMLResource out = ((XMLResource) _createResource);
      EList<EObject> _contents = out.getContents();
      ProjectToXmi _projectToXmi = new ProjectToXmi(resourceSet);
      Collection<EObject> _build = _projectToXmi.build();
      _contents.addAll(_build);
      TreeIterator<EObject> _allContents = out.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      for (final EObject e : _iterable) {
        String _generateUUID = EcoreUtil.generateUUID();
        out.setID(e, _generateUUID);
      }
      out.save(Collections.EMPTY_MAP);
      EList<EObject> _contents_1 = out.getContents();
      Iterable<Site> _filter = Iterables.<Site>filter(_contents_1, Site.class);
      final Site site = IterableExtensions.<Site>head(_filter);
      boolean _notEquals = (!Objects.equal(site, null));
      if (_notEquals) {
        SiteToHtml _siteToHtml = new SiteToHtml(site);
        CharSequence _html = _siteToHtml.html();
        fsa.generateFile("doc.html", _html);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
