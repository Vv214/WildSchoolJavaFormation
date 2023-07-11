package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public abstract class Player extends Perso implements Attaque {
    public Player(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    public void getDommage() {

    }

    @Override
    public void attaque1() {
        System.out.print(this.getName() + " attaque : ");
    }

    @Override
    public void attaque2() {
        System.out.print(this.getName() + " attaque : ");
    }

    @Override
    public void attaque3() {
        System.out.print(this.getName() + " attaque : ");
    }

    @Override
    public void attaque4() {
        System.out.print(this.getName() + " attaque : ");
    }
}
