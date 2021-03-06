package org.ollabaca.on.mm.uml.util;

import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.ollabaca.on.mm.uml.todo.Environment;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Environments {
  public static CharSequence table_Environment_Nodes(final Environment object) {
    TreeIterator<EObject> _eAllContents = object.eAllContents();
    Iterator<Node> _filter = Iterators.<Node>filter(_eAllContents, Node.class);
    Iterable<Node> _iterable = IteratorExtensions.<Node>toIterable(_filter);
    final Function1<Node, String> _function = new Function1<Node, String>() {
      public String apply(final Node it) {
        return it.getName();
      }
    };
    Column<Node> _column = Html.<Node>column("Name", _function);
    final Function1<Node, CharSequence> _function_1 = new Function1<Node, CharSequence>() {
      public CharSequence apply(final Node it) {
        EList<Property> _attributes = it.getAttributes();
        final Function1<Property, CharSequence> _function = new Function1<Property, CharSequence>() {
          public CharSequence apply(final Property it) {
            return Notation.notation_Object(it);
          }
        };
        final Function1<Property, CharSequence> _function_1 = new Function1<Property, CharSequence>() {
          public CharSequence apply(final Property it) {
            return Html.documentation_EObject(it);
          }
        };
        return Html.<Property>dl(_attributes, _function, _function_1);
      }
    };
    Column<Node> _column_1 = Html.<Node>column("Attributes", _function_1);
    final Function1<Node, CharSequence> _function_2 = new Function1<Node, CharSequence>() {
      public CharSequence apply(final Node it) {
        EList<PackageableElement> _deployedElements = it.getDeployedElements();
        final Function1<PackageableElement, CharSequence> _function = new Function1<PackageableElement, CharSequence>() {
          public CharSequence apply(final PackageableElement it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<PackageableElement>ul(_deployedElements, _function);
      }
    };
    Column<Node> _column_2 = Html.<Node>column("Deployed Elements", _function_2);
    final Function1<Node, CharSequence> _function_3 = new Function1<Node, CharSequence>() {
      public CharSequence apply(final Node it) {
        return Html.documentation_EObject(it);
      }
    };
    Column<Node> _column_3 = Html.<Node>column("Comment", _function_3);
    return Html.<Node>table(_iterable, 
      Collections.<Attr<Iterable<? extends Node>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Node>>>newArrayList()), 
      Collections.<Column<Node>>unmodifiableList(CollectionLiterals.<Column<Node>>newArrayList(_column, _column_1, _column_2, _column_3)));
  }
  
  public static CharSequence table_Environment_Deployments(final Environment object) {
    TreeIterator<EObject> _eAllContents = object.eAllContents();
    Iterator<Deployment> _filter = Iterators.<Deployment>filter(_eAllContents, Deployment.class);
    Iterable<Deployment> _iterable = IteratorExtensions.<Deployment>toIterable(_filter);
    final Function1<Deployment, String> _function = new Function1<Deployment, String>() {
      public String apply(final Deployment it) {
        DeploymentTarget _location = it.getLocation();
        return _location.getName();
      }
    };
    Column<Deployment> _column = Html.<Deployment>column("Location", _function);
    final Function1<Deployment, CharSequence> _function_1 = new Function1<Deployment, CharSequence>() {
      public CharSequence apply(final Deployment it) {
        EList<DeployedArtifact> _deployedArtifacts = it.getDeployedArtifacts();
        final Function1<DeployedArtifact, CharSequence> _function = new Function1<DeployedArtifact, CharSequence>() {
          public CharSequence apply(final DeployedArtifact it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<DeployedArtifact>ul(_deployedArtifacts, _function);
      }
    };
    Column<Deployment> _column_1 = Html.<Deployment>column("Deployed Artifacts", _function_1);
    final Function1<Deployment, CharSequence> _function_2 = new Function1<Deployment, CharSequence>() {
      public CharSequence apply(final Deployment it) {
        EList<DeploymentSpecification> _configurations = it.getConfigurations();
        final Function1<DeploymentSpecification, String> _function = new Function1<DeploymentSpecification, String>() {
          public String apply(final DeploymentSpecification it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("<li>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<dl>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<dt>Deployment Location</dt>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<dd><code>");
            String _deploymentLocation = it.getDeploymentLocation();
            _builder.append(_deploymentLocation, "\t\t");
            _builder.append("</code></dd>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("<dt>Execution Location</dt>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<dd><code>");
            String _executionLocation = it.getExecutionLocation();
            _builder.append(_executionLocation, "\t\t");
            _builder.append("</code></dd>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</dl>");
            _builder.newLine();
            _builder.append("</li>");
            _builder.newLine();
            return _builder.toString();
          }
        };
        return Html.<DeploymentSpecification>ul(_configurations, _function);
      }
    };
    Column<Deployment> _column_2 = Html.<Deployment>column("Configuration", _function_2);
    return Html.<Deployment>table(_iterable, 
      Collections.<Attr<Iterable<? extends Deployment>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Deployment>>>newArrayList()), 
      Collections.<Column<Deployment>>unmodifiableList(CollectionLiterals.<Column<Deployment>>newArrayList(_column, _column_1, _column_2)));
  }
}
