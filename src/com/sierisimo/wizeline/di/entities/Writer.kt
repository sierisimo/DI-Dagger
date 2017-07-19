package com.sierisimo.wizeline.di.entities

class Writer {
    var pen: Pen

    var paper: Paper

    init {
        paper = Paper()

        val ink = Ink()
        ink.color = "Black"

        pen = Pen()
        pen.ink = ink
    }

    fun write() {
        // Do stuff with the tools
    }
}