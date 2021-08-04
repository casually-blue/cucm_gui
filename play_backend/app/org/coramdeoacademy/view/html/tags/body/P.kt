package org.coramdeoacademy.view.html.tags.body

fun BodyTag.p(init: P.() -> Unit) = initTag(P(), init)
class P : BodyTag("p")