package org.coramdeoacademy.view.html.tags

import org.coramdeoacademy.view.html.attributes.Attribute
import org.coramdeoacademy.view.html.element.TextElement

abstract class TagWithText(name: String, vararg attributes: Attribute) : Tag(name, *attributes) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}