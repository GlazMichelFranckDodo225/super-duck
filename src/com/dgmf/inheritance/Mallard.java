package com.dgmf.inheritance;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class Mallard extends Duck {
    @Override
    public void display() {
        // Appearance of a Mallard
        displayMallard();
    }

    private void displayMallard() {
        System.out.println("Show the Mallard ...");
    }
}
