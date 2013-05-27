package org.ollabaca.on.ui.coloring;

import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.ollabaca.on.services.ObjectNotationGrammarAccess;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {
	
	@Inject
	IGrammarAccess grammar;
	
	Highlighter highlighter = new Highlighter();

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		
		if (resource == null || resource.getParseResult() == null)
			return;
		
		this.highlighter.highlight(resource, acceptor);
		
		ObjectNotationGrammarAccess lga = (ObjectNotationGrammarAccess)this.grammar;
		INode root = resource.getParseResult().getRootNode();
	    for (INode node : root.getAsTreeIterable()) {
	    	EObject grammarElement = node.getGrammarElement();
	    	if (grammarElement ==  lga.getML_COMMENTRule() && node.getText().startsWith("/**")) {
	    		INode sibling = node.getNextSibling();
    			//System.out.println("Associate comment " + node.getText() + " \n\tto " + sibling.getSemanticElement() + " \n\twith rule " + sibling.getGrammarElement());
	    		
//	    		EObject semantic = sibling.getSemanticElement();
//	    		if (semantic instanceof Element) {
//					Element element = (Element) semantic;
					
//					element.setDocumentation(this.parse(node.getText()));
//	    			System.out.println(String.format("DOC of [%s] = [%s]", element, element.getDocumentation()));
	    		}
	    		/*if (sibling.getGrammarElement() == lga.getInstanceRule()) {
	    			System.out.println("will associate comment " + node.getText() + " to " + sibling.getSemanticElement());
	    		}*/
	    		
	    	}
	    }
//	    
//		if (grammarElement instanceof RuleCall) {
//	       // ruleToAttributes.provideHighlightingFor(
//	       //     ((RuleCall) grammarElement).getRule(), node, acceptor);
//	      } else if (grammarElement instanceof Keyword) {
	       // keywordsToAttributes.provideHighlightingFor(
	        //    ((Keyword) grammarElement).getValue(), node, acceptor);
	      //}
//		BidiTreeIterable<INode> allNodes = resource.getParseResult()
//				.getRootNode().getAsTreeIterable();
//		for(INode node : allNodes) {
//			EObject element = node.getGrammarElement();
//			//if (element instanceof )
//			System.out.println("COLORING: " + element);
//		}
		
		//Unit unit = (Unit)resource.getContents().get(0);
		

//	}
//	}
	
//	void provideHighlightingFor(AbstractRule rule, INode node, IHighlightedPositionAcceptor acceptor) {
//		NodeModelUtils.findNodesForFeature(semanticObject, structuralFeature)
//		node.gets
//		
//		
//	}
	
	final Pattern pattern = Pattern.compile("^((\\s*/\\*\\*)|(\\s*\\*/)|(\\s*\\*\\s?))");
	
	String parse(String doc) {
		StringBuffer sb = new StringBuffer();
		for (String line : doc.split("\\r?\\n")) {
			sb.append(pattern.matcher(line).replaceFirst("")).append("\n");
		}
		return sb.toString().trim();
	}

}
