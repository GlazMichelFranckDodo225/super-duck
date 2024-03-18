package com.dgmf.interfaceprogramming;

import com.dgmf.interfaces.DuckDecoy;
import com.dgmf.interfaces.Mallard;
import com.dgmf.interfaces.Mandarin;
import com.dgmf.interfaces.RubberDuck;

public class DriverInterfaceProgramming {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        Mandarin mandarin = new Mandarin();
        RubberDuck rubberDuck = new RubberDuck();
        DuckDecoy duckDecoy = new DuckDecoy();

        // Outputs
        System.out.println(" ========== Mallard ========== ");
        mallard.display();
        mallard.swim();
        mallard.quack();
        mallard.fly();

        System.out.println(" ========== Mandarin ========== ");
        mandarin.display();
        mandarin.swim();
        mandarin.quack();
        mandarin.fly();

        System.out.println(" ========== Rubber Duck ========== ");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();

        System.out.println(" ========== Duck Decoy ========== ");
        duckDecoy.display();
        duckDecoy.swim();
    }
}