package org.coramdeoacademy.view.html.tags.body

fun BodyTag.b(init: B.() -> Unit) = initTag(B(), init)
class B : BodyTag("b")