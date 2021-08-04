package org.coramdeoacademy.view.html.tags

import org.coramdeoacademy.view.html.element.TextElement

abstract class TagWithText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}