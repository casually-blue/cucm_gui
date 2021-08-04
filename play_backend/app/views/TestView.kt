package views

import org.coramdeoacademy.view.*
import org.coramdeoacademy.view.html.tags.body.*
import org.coramdeoacademy.view.html.tags.head.*

class TestView: View(
    html {
        head {
            title { +"Test Page View" }
            meta(content="text/html;charset=utf8",httpEquiv="Content-Type")
            meta(content="utf-8",httpEquiv="encoding")
        }
        body {
            h1 {
                +"Hello from Kotlin View"
                br()
                a(href="/phones"){
                    +"Phones"
                }
            }
        }
    }
)