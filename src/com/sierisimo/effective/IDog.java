package com.sierisimo.effective;

/**
 * Created by Sinuhe_Jaime on 5/30/2017.
 */
public interface IDog {
    default void bark(){
        System.out.println("Bark");
    }
}
