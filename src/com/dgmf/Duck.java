package com.dgmf;

// Duck Superclass:
// All the Ducks Quack and Swim. The Superclass
// Manages the Implementation Code.
public abstract class Duck {
    public void quack() {}

    public void swim() {}

    // As all Duck Subtypes have a Different Appearance,
    // the "display()" Method is Abstract.
    public abstract void display();

    // Other methods specific to ducks...
}
