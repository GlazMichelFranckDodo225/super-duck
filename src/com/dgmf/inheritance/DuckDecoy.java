package com.dgmf.inheritance;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class DuckDecoy extends Duck {
    @Override
    public void display() {
        // Appearance of a Mandarin
        displayDuckDecoy();
    }

    private void displayDuckDecoy() {
        System.out.println("Show The Duck Decoy ...");
    }

    @Override
    public void quack() {
        // Redefine To Do Nothing
        System.out.println("Quack ==> Nothing ...");
    }

    @Override
    public void fly() {
        // Redefine To Do Nothing
        System.out.println("Fly ==> Nothing ...");
    }
}
