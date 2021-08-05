package org.coramdeoacademy.view.html.attributes

open class Attribute(val name: String, val value: String) {
}

class Lang(value: String): Attribute("lang", value)
fun lang(value: String): Attribute = Lang(value)