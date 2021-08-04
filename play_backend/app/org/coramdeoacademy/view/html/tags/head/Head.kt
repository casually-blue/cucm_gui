package org.coramdeoacademy.view.html.tags.head

import org.coramdeoacademy.view.html.HTML

fun HTML.head(init: Head.() -> Unit) = initTag(Head(), init)
class Head  : HeadTag("head")