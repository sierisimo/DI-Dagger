package com.sierisimo.wizeline.di.realworld.solid.inversion;

import com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities.NovelWriter;
import com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities.RobotWriter;
import com.sierisimo.wizeline.di.realworld.solid.inversion.good.entities.base.Writer;

public class InversionRealWorld {
    public static void writeANovel(Writer writer) {
        writer.write();
    }

    public static void writeCode(Writer writer) {
        writer.write();
    }

    public static void write() {
        writeANovel(new NovelWriter());
        writeCode(new RobotWriter());
    }
}
