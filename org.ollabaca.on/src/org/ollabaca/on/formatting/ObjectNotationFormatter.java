/*
 * generated by Xtext
 */
package org.ollabaca.on.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.ollabaca.on.services.ObjectNotationGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ObjectNotationFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		ObjectNotationGrammarAccess f = (ObjectNotationGrammarAccess) getGrammarAccess();
		for (Keyword comma : f.findKeywords("=")) {
			c.setSpace(" ").before(comma);
			c.setSpace(" ").after(comma);
		}

		for (Keyword keyword : f.findKeywords("#", ",")) {
			c.setNoSpace().before(keyword);
		}
		
		for (Keyword keyword : f.findKeywords("@", "&", "#")) {
			c.setNoSpace().after(keyword);
		}

		for (Keyword keyword : f.findKeywords("@title", "@abstract", "@doc", "@see", "@tag")) {
			c.setLinewrap(1, 1, 2).before(keyword);
			c.setSpace(" ").after(keyword);
		}
		
		c.setLinewrap(1, 1, 1).after(f.getInstanceAccess().getTitleAssignment_1_1());
		c.setLinewrap(1, 1, 1).after(f.getInstanceAccess().getAbstractAssignment_2_1());
		c.setLinewrap(1, 1, 1).after(f.getInstanceAccess().getDocumentationAssignment_3_1());
		c.setLinewrap(1, 1, 1).after(f.getInstanceAccess().getSeeAssignment_4_1());
		c.setLinewrap(1, 1, 1).after(f.getInstanceAccess().getTagsAssignment_5_1());

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("[", "]")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap().after(pair.getFirst());
			c.setLinewrap().before(pair.getSecond());
		}

		//c.setLinewrap(1, 1, 1).after(f.getUnitRule());
		c.setLinewrap(1, 1, 2).before(f.getImportRule());
		c.setLinewrap(1, 1, 1).after(f.getImportRule());

		c.setLinewrap(2, 2, 2).before(f.getInstanceRule());
		c.setLinewrap().before(f.getSlotRule());
		
		
		//c.setLinewrap(0, 0, 0).before(f.getLONG_STRINGRule());
		c.setLinewrap(0, 1, 1).after(f.getLONG_STRINGRule());
		c.setLinewrap(0, 1, 1).after(f.getMY_STRINGRule());

		// c.setSpace(" ").before(right)
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}
