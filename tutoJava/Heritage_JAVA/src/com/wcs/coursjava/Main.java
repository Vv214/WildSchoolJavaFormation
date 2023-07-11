package com.wcs.coursjava;

import com.wcs.coursjava.entity.Guerrier;
import com.wcs.coursjava.entity.Magicien;
import com.wcs.coursjava.entity.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DEBUT
        String selector = "guerrier";

        Player p1;
        if (selector.equals("guerrier")) {
            p1 = new Guerrier("Hugo");
        } else if (selector.equals("magicien")) {
            p1 = new Magicien();
        } else {
            System.out.println("Pauvre péon ...");
            return;
        }
        p1.attaque1();
        // FIN
    }
}



