package com.wcs.coursjava.entity;

public class Magicien extends Player {

    Magicien(String name) {
        super(name, 10);
    }

    public Magicien() {
        this("Mage");
    }

    @Override
    public void attaque1() {
        super.attaque1();
        System.out.println("une boule de feu !");
    }
}
