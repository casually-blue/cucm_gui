package org.coramdeoacademy.view.html.tags.body

import org.coramdeoacademy.view.html.HTML

fun HTML.body(init: Body.() -> Unit) = initTag(Body(), init)
class Body : BodyTag("body")