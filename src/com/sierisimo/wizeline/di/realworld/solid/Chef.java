package com.sierisimo.wizeline.di.realworld.solid;

import com.sierisimo.wizeline.di.realworld.solid.liskov.Duck;
import com.sierisimo.wizeline.di.realworld.solid.liskov.Ostrich;

public class Chef {
    public void cookDuck(Duck duck) {

    }

    public void cookOstrich(Ostrich ostrich) {

    }

    public void cookEggs(Duck duck) {
        Object[] eggs = duck.getEggs();
    }

    public void cookEggs(Ostrich ostrich) {
        Object[] eggs = ostrich.getEggs();
    }
}
