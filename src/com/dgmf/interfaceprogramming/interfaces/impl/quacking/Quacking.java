package com.dgmf.interfaceprogramming.interfaces.impl.quacking;

import com.dgmf.interfaceprogramming.interfaces.BehaviorQuacking;

// Ducks Quacking
public class Quacking implements BehaviorQuacking {
    @Override
    public void quack() {
        System.out.println("Quack ... (\"Interface Programming\" Package)");
    }
}
