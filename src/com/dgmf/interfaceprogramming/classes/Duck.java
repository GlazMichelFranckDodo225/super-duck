package com.dgmf.interfaceprogramming.classes;

import com.dgmf.interfaceprogramming.interfaces.BehaviorFlight;
import com.dgmf.interfaceprogramming.interfaces.BehaviorQuacking;

public abstract class Duck {
    // Behavioral Variables are Declared of the Type of
    // INTERFACE That Manages the Behavior.
    // Each Duck Object Will Affect These Two Polymorphic
    // Variables to Reference the Specific Type of Behavior
    // It Would Like to Have at Runtime.
    // At Runtime, Instance Variables will Contain a
    // Reference to a Specific Behavior.
    private BehaviorFlight behaviorFlight;
    private BehaviorQuacking behaviorQuacking;

    public void swim() {
        System.out.println("Swim ... (\"Programming Interfaces\" Package)");
    }

    // As all Duck Subtypes have a Different Appearance,
    // the "display()" Method is Abstract.
    public abstract void display();

    // These two Methods Replace the fly() and quack() Methods.
    public void performQuack() {}
    public void performFlight() {}

    // Other Methods Specific to Ducks...
}
