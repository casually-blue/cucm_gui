package org.coramdeoacademy.view.html.element

import org.coramdeoacademy.view.html.element.Element

class TextElement(val text: String) : Element {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent$text\n")
    }
}