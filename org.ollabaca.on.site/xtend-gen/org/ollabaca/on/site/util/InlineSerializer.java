package org.ollabaca.on.site.util;

import org.pegdown.LinkRenderer;
import org.pegdown.ToHtmlSerializer;
import org.pegdown.ast.ParaNode;

@SuppressWarnings("all")
public class InlineSerializer extends ToHtmlSerializer {
  public InlineSerializer(final LinkRenderer linkRenderer) {
    super(linkRenderer);
  }
  
  public void visit(final ParaNode node) {
    this.visitChildren(node);
  }
}
