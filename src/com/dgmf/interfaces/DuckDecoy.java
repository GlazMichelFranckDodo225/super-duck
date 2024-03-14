package com.dgmf.interfaces;

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
        System.out.println("Show The Duck Decoy ... (\"Interfaces\" Package)");
    }
}
