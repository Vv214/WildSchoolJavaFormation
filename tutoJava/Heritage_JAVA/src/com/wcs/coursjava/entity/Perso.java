package com.wcs.coursjava.entity;

abstract class Perso {
    private String name;
    private int pv;

    Perso(String name, int pv) {
        this.name = name;
        this.pv = pv;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return this.pv;
    }

    protected void setPv(int pv) {
        this.pv = pv;
    }
}
