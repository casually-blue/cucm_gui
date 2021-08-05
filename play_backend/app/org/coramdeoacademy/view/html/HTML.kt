package org.coramdeoacademy.view.html

import org.coramdeoacademy.view.html.tags.TagWithText
import org.coramdeoacademy.view.html.attributes.Attribute

class HTML(vararg attributes: Attribute) : TagWithText("html", *attributes){
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("<!DOCTYPE html>\n")
        super.render(builder, indent)
    }
}

