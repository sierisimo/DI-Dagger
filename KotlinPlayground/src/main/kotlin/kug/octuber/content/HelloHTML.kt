package kug.octuber.content

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun getRoot(): String = createHTML().html {
    head {
        script(src = "/")
    }

    body {
        p(classes = "sier chingon") {
            +"Hello Sier"
        }
    }
}
