package com.dgmf.inheritance;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class Mandarin extends Duck {
    @Override
    public void display() {
        // Appearance of a Mandarin
        displayMandarin();
    }

    private void displayMandarin() {
        System.out.println("Show The Mandarin ...");
    }
}
