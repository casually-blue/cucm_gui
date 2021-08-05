package org.coramdeoacademy.view.html

import org.coramdeoacademy.view.html.tags.TagWithText

class HTML : TagWithText("html"){
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("<!DOCTYPE html>\n")
        super.render(builder, indent)
    }
}

