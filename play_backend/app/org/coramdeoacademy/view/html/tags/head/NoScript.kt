package org.coramdeoacademy.view.html.tags.head

fun HeadTag.noscript(init: NoScript.() -> Unit) = initTag(NoScript(), init)
class NoScript: HeadTag("noscript")