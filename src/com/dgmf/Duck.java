package com.dgmf;

// Duck Superclass:
// All the Ducks Quack and Swim. The Superclass
// Manages the Implementation Code.
public abstract class Duck {
    public void quack() {
        System.out.println("A Duck Quacks ...");
    }

    public void swim() {
        System.out.println("A Duck Swims ...");
    }

    // As all Duck Subtypes have a Different Appearance,
    // the "display()" Method is Abstract.
    public abstract void display();

    // Other methods specific to ducks...
}
