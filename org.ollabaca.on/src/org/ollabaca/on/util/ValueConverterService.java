package org.ollabaca.on.util;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

public class ValueConverterService extends Ecore2XtextTerminalConverters {
	
//	public ValueConverterService() {
//		System.out.println(this + ".CREATED");
//	}
//
	IValueConverter<String> LONG_STRING = new AbstractLexerBasedConverter<String>() {

		protected String toEscapedString(String value) {
			System.out.println(this + "CALLED");
			return "(\"" + value + "\")";
		};

		@Override
		public String toValue(String string, INode node)
				throws ValueConverterException {
			return string.substring(2, string.length() - 2);
		}

	};

	IValueConverter<String> MY_STRING = new AbstractLexerBasedConverter<String>() {

		protected String toEscapedString(String value) {
			return '"' + value + '"';
		};

		@Override
		public String toValue(String string, INode node)
				throws ValueConverterException {
			return string.substring(1, string.length() - 1);
		}

	};
	
	/*@ValueConverter(rule = "ESTRING")
	public IValueConverter<String> getESTRINGConverter() {
		return ESTRING;
	}*/
	
//	@ValueConverter(rule = "SHORT_STRING")
//	public IValueConverter<String> getSHORT_STRINGConverter() {
//		return STRING();
//	}
//	
	@ValueConverter(rule = "LONG_STRING")
	public IValueConverter<String> getLONG_STRINGConverter() {
		return LONG_STRING;
	}
	@ValueConverter(rule = "MY_STRING")
	public IValueConverter<String> getMY_STRINGConverter() {
		return MY_STRING;
	}
//	
//	
//	@Override
//	protected IValueConverter<Object> getConverter(String lexerRule) {
//		System.out.println("getConverter " + lexerRule);
//		return super.getConverter(lexerRule);
//	}

}
