package org.ollabaca.on.mm.uml;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.util.Levels;

@SuppressWarnings("all")
public class Layout_Element {
  public static <E extends Element> CharSequence layout_Element(final String id, final String title, final E object, final Function1<? super E,? extends CharSequence> body, final Function1<? super E,? extends CharSequence> subsection) {
    StringConcatenation _builder = new StringConcatenation();
    final int level = Levels.start();
    _builder.newLineIfNotEmpty();
    _builder.append("<section id=\"");
    _builder.append(id, "");
    _builder.append("\" class=\"level-");
    _builder.append(level, "");
    _builder.append(" ");
    EClass _eClass = object.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"row-fluid\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"span2\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h");
    _builder.append(level, "\t\t\t");
    _builder.append(" class=\"marker text-right\">&nbsp;</h");
    _builder.append(level, "\t\t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"span10\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h");
    _builder.append(level, "\t\t\t");
    _builder.append(">");
    _builder.append(title, "\t\t\t");
    _builder.append("</h");
    _builder.append(level, "\t\t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(body, null));
      if (_notEquals) {
        _builder.append("\t\t\t");
        CharSequence _apply = body.apply(object);
        _builder.append(_apply, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    {
      boolean _notEquals_1 = (!Objects.equal(subsection, null));
      if (_notEquals_1) {
        _builder.append("\t");
        CharSequence _apply_1 = subsection.apply(object);
        _builder.append(_apply_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("<!-- ");
    int _end = Levels.end();
    _builder.append(_end, "");
    _builder.append(" -->");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
