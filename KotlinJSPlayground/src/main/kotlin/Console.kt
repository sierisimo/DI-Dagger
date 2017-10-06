import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlin.browser.document

fun main(args: Array<String>) {
    val listOfNumbers = listOf(1, 4, 9, -9).filter { it > 0 }.map { Sier(it, it.toString()) }
    println(listOfNumbers)
    document.create.div(classes = "sier2 oRMando") {
        +"Ormando RM"
    }
}