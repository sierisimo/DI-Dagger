package com.sierisimo.wizeline.di.entities

class Writer {
    var pen: Pen
    var ink: Ink

    var paper: Paper

    init {
        ink = Ink()
        ink.color = "Red"

        pen = Pen()
        pen.ink = ink

        paper = Paper()
        paper.type = "A4"
    }

    fun writeNovel() {
        // Do stuff with the tools
    }
}