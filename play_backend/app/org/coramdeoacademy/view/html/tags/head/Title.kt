package org.coramdeoacademy.view.html.tags.head

fun HeadTag.title(init: Title.() -> Unit) = initTag(Title(), init)
class Title : HeadTag("title")