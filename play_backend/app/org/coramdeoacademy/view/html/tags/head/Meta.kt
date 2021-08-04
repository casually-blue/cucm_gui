package org.coramdeoacademy.view.html.tags.head

fun HeadTag.meta(content: String, httpEquiv: String){
    val a = initTag(Meta()) {}
    a.content = content
    a.httpEquiv = httpEquiv
}
class Meta : HeadTag("meta"){
    var content: String
        get() = attributes["content"]!!
        set(value) {
            attributes["content"] = value
        }
    var httpEquiv: String
        get() = attributes["http-equiv"]!!
        set(value) {
            attributes["http-equiv"] = value
        }
}