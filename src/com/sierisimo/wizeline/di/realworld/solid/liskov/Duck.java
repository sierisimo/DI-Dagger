package com.sierisimo.wizeline.di.realworld.solid.liskov;

public class Duck extends FlyingBird {
    @Override
    public Object[] getEggs() {
        return new Object[0];
    }
}
