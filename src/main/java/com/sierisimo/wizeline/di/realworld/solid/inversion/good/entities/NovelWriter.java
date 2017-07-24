package com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities;

import com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities.base.Writer;

public class NovelWriter extends Writer {
    public NovelWriter() {
        pen = new InkPen();
        paper = new A2Paper();
    }

    @Override
    public void write() {
        pen.writeOver(paper);
    }
}
