package com.dgmf.interfaces;

import com.dgmf.interfaces.interfaces.Flying;
import com.dgmf.interfaces.interfaces.Quacking;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class Mallard extends Duck implements Flying, Quacking {
    @Override
    public void display() {
        // Appearance of a Mallard
        displayMallard();
    }

    private void displayMallard() {
        System.out.println("Show the Mallard ... (\"Interfaces\" Package)");
    }

    @Override
    public void fly() {
        System.out.println("Fly ... (\"Interfaces\" Package)");
    }

    @Override
    public void quack() {
        System.out.println("Quack ... (\"Interfaces\" Package)");
    }
}
