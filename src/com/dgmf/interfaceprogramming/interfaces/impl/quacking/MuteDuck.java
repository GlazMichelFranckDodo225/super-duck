package com.dgmf.interfaceprogramming.interfaces.impl.quacking;

import com.dgmf.interfaceprogramming.interfaces.BehaviorQuacking;

// Ducks That Make No Sound
public class MuteDuck implements BehaviorQuacking {
    @Override
    public void quack() {
        System.out.println("Do Nothing - the Duck Can't Quack ... " +
            "(\"Interface Programming\" Package)");
    }
}
