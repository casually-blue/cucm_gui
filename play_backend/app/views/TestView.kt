package views

import com.github.casuallyblue.view.*
import com.github.casuallyblue.view.html.attributes.*
import com.github.casuallyblue.view.html.tags.body.*
import com.github.casuallyblue.view.html.tags.head.*

class TestView: View(
    html(lang("en")) {
        head {
            title { +"Test Page View" }
            meta(content("text/html;charset=utf8"), httpEquiv("Content-Type"))
            meta(content("utf-8"), httpEquiv("encoding"))
        }
        body {
            h1(
                id("home"),
                `class`("test", "data")
            ) {
                +"Hello from Kotlin View"
                br()
                a(href("/phones")){
                    +"Phones"
                }
            }
            p{
                for(i in 1..3) {
                    +"Count $i"
                }
            }
        }
    }
)