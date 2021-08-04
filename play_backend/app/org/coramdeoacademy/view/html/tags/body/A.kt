package org.coramdeoacademy.view.html.tags.body

fun BodyTag.a(href: String, init: A.() -> Unit) {
    val a = initTag(A(), init)
    a.href = href
}
class A : BodyTag("a") {
    var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}