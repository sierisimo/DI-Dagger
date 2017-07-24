package com.sierisimo.wizeline.di.realworld.solid.liskov;

public class Ostrich extends Bird {
    @Override
    public Object[] getEggs() {
        return new Object[0];
    }
}
