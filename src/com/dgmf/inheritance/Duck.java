package com.dgmf.inheritance;

// Duck Superclass:
// All the Ducks Quack and Swim. The Superclass
// Manages the Implementation Code.
public abstract class Duck {
    public void quack() {
        System.out.println("Quack ...");
    }

    public void swim() {
        System.out.println("Swim ...");
    }

    // As all Duck Subtypes have a Different Appearance,
    // the "display()" Method is Abstract.
    public abstract void display();
    
    // Now Duck Is Flying
    public void fly() {
        System.out.println("Fly ...");
    }

    // Other methods specific to ducks...
}
