package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public class Guerrier extends Player {
    public Guerrier(String name) throws InvalidPVException, EmptyNameException {
        super(name, 50);
    }

    public Guerrier(String name, int pv) throws  InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    @Override
    public void attaque1() {
        super.attaque1();
        System.out.println("coup de hache !");
    }
}
