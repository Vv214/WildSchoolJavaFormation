package com.wcs.coursjava.entity;

public class Guerrier extends Player {
    public Guerrier(String name) {
        super(name, 50);
    }

    @Override
    public void attaque1() {
        super.attaque1();
        System.out.println("coup de hache !");
    }
}
