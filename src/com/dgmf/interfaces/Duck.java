package com.dgmf.interfaces;

public abstract class Duck {

    public void swim() {
        System.out.println("Swim ... (\"Interfaces\" Package)");
    }

    // As all Duck Subtypes have a Different Appearance,
    // the "display()" Method is Abstract.
    public abstract void display();

    // Other methods specific to ducks...
}
