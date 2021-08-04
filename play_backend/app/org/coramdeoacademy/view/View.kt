package org.coramdeoacademy.view

import org.coramdeoacademy.view.html.HTML
import play.mvc.Result

open class View(private val document: HTML) {
    fun render(): Result {
        return document.render()
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}