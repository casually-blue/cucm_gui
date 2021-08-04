package org.coramdeoacademy.view.html.tags.body

fun BodyTag.h1(init: H1.() -> Unit) = initTag(H1(), init)
class H1 : BodyTag("h1")