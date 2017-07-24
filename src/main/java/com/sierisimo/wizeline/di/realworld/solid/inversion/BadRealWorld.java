package com.sierisimo.wizeline.di.realworld.solid.inversion;

import com.sierisimo.wizeline.di.realworld.solid.inversion.bad.entities.Ink;
import com.sierisimo.wizeline.di.realworld.solid.inversion.bad.entities.Paper;
import com.sierisimo.wizeline.di.realworld.solid.inversion.bad.entities.Pen;
import com.sierisimo.wizeline.di.realworld.solid.inversion.bad.entities.Writer;

public class BadRealWorld {
    public static void writeNovel() {
        Writer writer = new Writer();
        writer.paper = new Paper();
        writer.paper.type = "A2";

        writer.pen = new Pen();
        writer.pen.ink = new Ink();
        writer.pen.ink.color = "Red";

        writer.write();
    }
}
