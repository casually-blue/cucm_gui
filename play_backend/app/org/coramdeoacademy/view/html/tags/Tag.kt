package org.coramdeoacademy.view.html.tags

import org.coramdeoacademy.view.html.element.Element
import org.coramdeoacademy.view.html.HtmlTagMarker

@HtmlTagMarker
abstract class Tag(val name: String) : Element {
    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String) {
        if(children.isNotEmpty()) {
            builder.append("$indent<$name${renderAttributes()}>\n")
            for (c in children) {
                c.render(builder, "$indent  ")
            }
            builder.append("$indent</$name>\n")
        } else {
            builder.append("$indent<$name${renderAttributes()}/>\n")
        }
    }

    private fun renderAttributes(): String {
        val builder = StringBuilder()
        for ((attr, value) in attributes) {
            builder.append(" $attr=\"$value\"")
        }
        return builder.toString()
    }

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}