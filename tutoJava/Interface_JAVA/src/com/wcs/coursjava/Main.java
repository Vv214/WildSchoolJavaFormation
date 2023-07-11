package com.wcs.coursjava;

import com.wcs.coursjava.entity.Attaque;
import com.wcs.coursjava.entity.Goblin;
import com.wcs.coursjava.entity.Guerrier;
import com.wcs.coursjava.entity.Player;
import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptyNameException, InvalidPVException {
        Guerrier player = new Guerrier("Robert");
        Goblin monster = new Goblin("Goblin", 5);

        Scanner sc = new Scanner(System.in);

        while (player.getPv() > 0 && monster.getPv() > 0) {
            // JOUEUR
            System.out.println("Tour du joueur ...");
            System.out.print("Choisir son attaque (1,2,3,4) : ");
            int select = sc.nextInt();
            selectAttaque(player, select);
            // MONSTRE
            System.out.println("Tour du monstre ...");
            selectAttaque(monster, 1);
        }
        sc.close();
        System.out.println("GAME OVER");
    }

    public static void selectAttaque(Attaque attaque, int select) {
        if (select == 1) {
            attaque.attaque1();
        } else if (select == 2) {
            attaque.attaque2();
        } else if (select == 3) {
            attaque.attaque3();
        } else if (select == 4) {
            attaque.attaque4();
        } else {
            System.out.println("Raté ....");
        }
    }
}



