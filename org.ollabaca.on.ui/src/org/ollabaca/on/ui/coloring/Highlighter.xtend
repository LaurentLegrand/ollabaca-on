package org.ollabaca.on.ui.coloring

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.ollabaca.on.model.Instance
import org.ollabaca.on.model.ModelPackage$Literals
import org.ollabaca.on.model.InstanceRef
import org.ollabaca.on.model.Slot
import org.ollabaca.on.model.StringValue
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.ollabaca.on.model.Import
import org.ollabaca.on.model.Container

class Highlighter {
	
	def highlight(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
	
		for(e: resource.allContents.toIterable) {
			
			switch (e) {
				Instance: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__NAME)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::INSTANCE_NAME)
					}					
					
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__TYPE)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::INSTANCE_TYPE)
					}
					
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__TITLE)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::INSTANCE_TITLE)
					}
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__ABSTRACT)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::INSTANCE_ABSTRACT)
					}
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__DOCUMENTATION)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::INSTANCE_DOCUMENTATION)
					}
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE__SEE)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::REF_ID)
					}
				}
				InstanceRef: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::INSTANCE_REF__VALUE)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::REF_ID)
					}					
				}
				Slot: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::SLOT__NAME)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::SLOT_NAME)
					}			
				}
				StringValue: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::STRING_VALUE__VALUE)) {
						if (node.startLine == node.endLine) {
							acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::SINGLELINE)
						} else {
							acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::MULTILINE)
						}
					}					
				}
				Import: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::IMPORT__NAME)) {
						acceptor.addPosition(node.offset, node.length, DefaultHighlightingConfiguration::STRING_ID)
					}					
				}
				
				Container: {
					for(node: NodeModelUtils::findNodesForFeature(e, Literals::CONTAINER__INSTANCE)) {
						acceptor.addPosition(node.offset, node.length, HighlightingConfiguration::REF_ID)
					}					
				}
				
				
			}
			
		}
				
	}
}