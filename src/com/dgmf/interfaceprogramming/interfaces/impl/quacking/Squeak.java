package com.dgmf.interfaceprogramming.interfaces.impl.quacking;

import com.dgmf.interfaceprogramming.interfaces.BehaviorQuacking;

// Squeaking Ducks
public class Squeak implements BehaviorQuacking {
    @Override
    public void quack() {
        squeak();
    }

    private void squeak() {
        System.out.println("Squeak ... (\"Interface Programming\" Package)");
    }
}
