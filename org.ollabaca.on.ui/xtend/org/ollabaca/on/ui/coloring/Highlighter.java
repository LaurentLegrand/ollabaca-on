package org.ollabaca.on.ui.coloring;

import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.ollabaca.on.model.Container;
import org.ollabaca.on.model.Import;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.InstanceRef;
import org.ollabaca.on.model.ModelPackage.Literals;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.model.StringValue;
import org.ollabaca.on.ui.coloring.HighlightingConfiguration;

@SuppressWarnings("all")
public class Highlighter {
  public void highlight(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    for (final EObject e : _iterable) {
      boolean _matched = false;
      if (!_matched) {
        if (e instanceof Instance) {
          final Instance _instance = (Instance)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__NAME);
          for (final INode node : _findNodesForFeature) {
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.INSTANCE_NAME);
          }
          List<INode> _findNodesForFeature_1 = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__TYPE);
          for (final INode node_1 : _findNodesForFeature_1) {
            int _offset_1 = node_1.getOffset();
            int _length_1 = node_1.getLength();
            acceptor.addPosition(_offset_1, _length_1, HighlightingConfiguration.INSTANCE_TYPE);
          }
          List<INode> _findNodesForFeature_2 = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__TITLE);
          for (final INode node_2 : _findNodesForFeature_2) {
            int _offset_2 = node_2.getOffset();
            int _length_2 = node_2.getLength();
            acceptor.addPosition(_offset_2, _length_2, HighlightingConfiguration.INSTANCE_TITLE);
          }
          List<INode> _findNodesForFeature_3 = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__ABSTRACT);
          for (final INode node_3 : _findNodesForFeature_3) {
            int _offset_3 = node_3.getOffset();
            int _length_3 = node_3.getLength();
            acceptor.addPosition(_offset_3, _length_3, HighlightingConfiguration.INSTANCE_ABSTRACT);
          }
          List<INode> _findNodesForFeature_4 = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__DOCUMENTATION);
          for (final INode node_4 : _findNodesForFeature_4) {
            int _offset_4 = node_4.getOffset();
            int _length_4 = node_4.getLength();
            acceptor.addPosition(_offset_4, _length_4, HighlightingConfiguration.INSTANCE_DOCUMENTATION);
          }
          List<INode> _findNodesForFeature_5 = NodeModelUtils.findNodesForFeature(_instance, Literals.INSTANCE__SEE);
          for (final INode node_5 : _findNodesForFeature_5) {
            int _offset_5 = node_5.getOffset();
            int _length_5 = node_5.getLength();
            acceptor.addPosition(_offset_5, _length_5, HighlightingConfiguration.REF_ID);
          }
        }
      }
      if (!_matched) {
        if (e instanceof InstanceRef) {
          final InstanceRef _instanceRef = (InstanceRef)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_instanceRef, Literals.INSTANCE_REF__VALUE);
          for (final INode node : _findNodesForFeature) {
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.REF_ID);
          }
        }
      }
      if (!_matched) {
        if (e instanceof Slot) {
          final Slot _slot = (Slot)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_slot, Literals.SLOT__NAME);
          for (final INode node : _findNodesForFeature) {
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.SLOT_NAME);
          }
        }
      }
      if (!_matched) {
        if (e instanceof StringValue) {
          final StringValue _stringValue = (StringValue)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_stringValue, Literals.STRING_VALUE__VALUE);
          for (final INode node : _findNodesForFeature) {
            int _startLine = node.getStartLine();
            int _endLine = node.getEndLine();
            boolean _equals = (_startLine == _endLine);
            if (_equals) {
              int _offset = node.getOffset();
              int _length = node.getLength();
              acceptor.addPosition(_offset, _length, HighlightingConfiguration.SINGLELINE);
            } else {
              int _offset_1 = node.getOffset();
              int _length_1 = node.getLength();
              acceptor.addPosition(_offset_1, _length_1, HighlightingConfiguration.MULTILINE);
            }
          }
        }
      }
      if (!_matched) {
        if (e instanceof Import) {
          final Import _import = (Import)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_import, Literals.IMPORT__NAME);
          for (final INode node : _findNodesForFeature) {
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, DefaultHighlightingConfiguration.STRING_ID);
          }
        }
      }
      if (!_matched) {
        if (e instanceof Container) {
          final Container _container = (Container)e;
          _matched=true;
          List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(_container, Literals.CONTAINER__INSTANCE);
          for (final INode node : _findNodesForFeature) {
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.REF_ID);
          }
        }
      }
    }
  }
}
