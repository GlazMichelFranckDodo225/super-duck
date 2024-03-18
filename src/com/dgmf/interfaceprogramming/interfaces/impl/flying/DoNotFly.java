package com.dgmf.interfaceprogramming.interfaces.impl.flying;

import com.dgmf.interfaceprogramming.interfaces.BehaviorFlight;

// This is the Implementation for all Ducks
// That Cannot Fly
public class DoNotFly implements BehaviorFlight {
    @Override
    public void fly() {
        System.out.println("Do Nothing - the Duck Can't Fly ... " +
                "(\"Interface Programming\" Package)");
    }
}
