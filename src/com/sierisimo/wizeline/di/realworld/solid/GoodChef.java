package com.sierisimo.wizeline.di.realworld.solid;

import com.sierisimo.wizeline.di.realworld.solid.liskov.Bird;

public class GoodChef {
    public void cookBird(Bird bird) {

    }

    public void cookEggs(Bird bird) {
        Object[] eggs = bird.getEggs();
    }
}
