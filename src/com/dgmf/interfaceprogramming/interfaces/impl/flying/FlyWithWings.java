package com.dgmf.interfaceprogramming.interfaces.impl.flying;

import com.dgmf.interfaceprogramming.interfaces.BehaviorFlight;

// This is the Implementation of Flight for
// all Ducks with Wings
public class FlyWithWings implements BehaviorFlight {
    @Override
    public void fly() {
        System.out.println("Fly ... (\"Interface Programming\" Package)");
    }
}
