package com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities;

import com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities.base.Writer;

public class RobotWriter extends Writer {
    public RobotWriter() {
        pen = new LaserPen();
        paper = new DigitalPaper();
    }

    @Override
    public void write() {

    }
}
