package com.dgmf.interfaces;

import com.dgmf.interfaces.interfaces.Quacking;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class RubberDuck extends Duck implements Quacking {
    @Override
    public void display() {
        // Appearance of a Mandarin
        displayRubberDuck();
    }

    private void displayRubberDuck() {
        System.out.println("Show The Rubber Duck ... (\"Interfaces\" Package)");
    }

    @Override
    public void quack() {
        squeal();
    }

    private void squeal() {
        System.out.println("Squeal ... (\"Interfaces\" Package)");
    }
}
