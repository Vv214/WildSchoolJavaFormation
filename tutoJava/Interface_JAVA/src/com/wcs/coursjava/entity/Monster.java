package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public abstract class Monster extends Perso implements Attaque {

    public Monster(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    @Override
    public void attaque1() {

    }

    @Override
    public void attaque2() {

    }

    @Override
    public void attaque3() {

    }

    @Override
    public void attaque4() {

    }
}

