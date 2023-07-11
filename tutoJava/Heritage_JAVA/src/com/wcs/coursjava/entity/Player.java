package com.wcs.coursjava.entity;

public abstract class Player extends Perso {
    public Player(String name, int pv) {
        super(name, pv);
    }


    public void attaque1() {
        System.out.print(this.getName() + " attaque : ");
    }
}
