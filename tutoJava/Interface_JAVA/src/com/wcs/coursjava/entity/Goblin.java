package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public class Goblin extends Monster {
    public Goblin(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    @Override
    public void attaque1() {
        super.attaque1();
        System.out.println("Coup d'épée !");
    }

    @Override
    public void attaque2() {
        super.attaque2();
    }

    @Override
    public void attaque3() {
        super.attaque3();
    }

    @Override
    public void attaque4() {
        super.attaque4();
    }
}
