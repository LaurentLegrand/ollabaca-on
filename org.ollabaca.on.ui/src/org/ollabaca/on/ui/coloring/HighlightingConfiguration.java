package org.ollabaca.on.ui.coloring;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String INSTANCE_NAME = "instance.name";

	public static final String INSTANCE_TYPE = "instance.type";

	public static final String INSTANCE_TITLE = "instance.title";

	public static final String INSTANCE_ABSTRACT = "instance.abstract";

	public static final String INSTANCE_DOCUMENTATION = "instance.documentation";

	public static final String REF_ID = "ref";

	public static final String SLOT_NAME = "slot.name";

	public static final String SINGLELINE = "singleline";

	public static final String MULTILINE = "multiline";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(INSTANCE_NAME, "Instance Name", instanceNameStyle());
		acceptor.acceptDefaultHighlighting(INSTANCE_TYPE, "Instance Type", instanceTypeStyle());
		acceptor.acceptDefaultHighlighting(INSTANCE_TITLE, "Instance Title", instanceTitleStyle());
		acceptor.acceptDefaultHighlighting(INSTANCE_ABSTRACT, "Instance Abstract", instanceAbstractStyle());
		acceptor.acceptDefaultHighlighting(INSTANCE_DOCUMENTATION, "Instance Documentation", instanceDocumentationStyle());
		acceptor.acceptDefaultHighlighting(REF_ID, "Reference", refStyle());
		acceptor.acceptDefaultHighlighting(SLOT_NAME, "Slot Name", slotNameStyle());
		acceptor.acceptDefaultHighlighting(SINGLELINE, "Singleline", singlelineStyle());
		acceptor.acceptDefaultHighlighting(MULTILINE, "Multiline", mutlilineStyle());

	}

	public TextStyle instanceNameStyle() {
		TextStyle textStyle = new TextStyle();
		// textStyle.setColor(rgb(0xd7b5d8));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	// purd4 color scheme
	public TextStyle instanceTypeStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(rgb(0xd7b5d8));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle instanceTitleStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(rgb(0x0080c0));
		// textStyle.setStyle(SWT.BOLD);
		textStyle.setBackgroundColor(rgb(0xf1eef6));
		textStyle.setFontData(new FontData("Consolas", 11, SWT.BOLD));
		return textStyle;
	}

	public TextStyle instanceAbstractStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(rgb(0x0080c0));
		// textStyle.setStyle(SWT.BOLD);
		textStyle.setBackgroundColor(rgb(0xf1eef6));
		textStyle.setFontData(new FontData("Consolas", 11, SWT.ITALIC));
		return textStyle;
	}

	public TextStyle instanceDocumentationStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(rgb(0x0080c0));
		// textStyle.setStyle(SWT.BOLD);
		textStyle.setBackgroundColor(rgb(0xf1eef6));
		textStyle.setFontData(new FontData("Consolas", 10, SWT.NORMAL));
		return textStyle;
	}

	public TextStyle singlelineStyle() {
		TextStyle textStyle = new TextStyle();
		// textStyle.setColor(rgb(0xd7b5d8));
		// textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(rgb(0x4393c3));
		textStyle.setFontData(new FontData("Consolas", 11, SWT.BOLD));
		return textStyle;
	}

	public TextStyle mutlilineStyle() {
		TextStyle textStyle = new TextStyle();
		// textStyle.setColor(rgb(0xd7b5d8));
		// textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(rgb(0x2166ac));
		textStyle.setFontData(new FontData("Consolas", 11, SWT.BOLD));
		return textStyle;
	}

	public TextStyle refStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(rgb(0xdf65b0));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle slotNameStyle() {
		TextStyle textStyle = new TextStyle();

		textStyle.setColor(rgb(0xce1256));
		// textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	RGB rgb(int rgb) {
		Color color = new Color(rgb);
		return new RGB(color.getRed(), color.getGreen(), color.getBlue());

	}

}
