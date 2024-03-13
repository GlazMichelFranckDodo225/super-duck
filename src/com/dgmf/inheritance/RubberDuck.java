package com.dgmf.inheritance;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class RubberDuck extends Duck {
    @Override
    public void display() {
        // Appearance of a Mandarin
        displayRubberDuck();
    }

    private void displayRubberDuck() {
        System.out.println("Show The Rubber Duck ...");
    }

    @Override
    public void quack() {
        squeal();
    }

    @Override
    public void fly() {
        // Redefine To Do Nothing
        System.out.println("Fly ==> Nothing ...");
    }

    private void squeal() {
        System.out.println("Squeal ...");
    }
}
