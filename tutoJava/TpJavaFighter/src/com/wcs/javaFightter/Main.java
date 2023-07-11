package TpJavaFighter.src.com.wcs.javaFightter;

import java.util.Scanner;

import TpJavaFighter.src.com.wcs.javaFightter.entity.Elf;
import TpJavaFighter.src.com.wcs.javaFightter.entity.Human;
import TpJavaFighter.src.com.wcs.javaFightter.entity.Player;

public class Main {

    private static Scanner scanner = null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        var game = new Main();
        game.startGame();
        scanner.close();
    }

    void startGame() {
        int count = 0;
        System.out.println("Hello à toi nouveau Gamer !!!! ");
        System.out.println("Welcome sur le JavaFighter!");
        Player player1 = null;
        Player player2 = null;
        player1 = choosePlayer(count++);
        player1.myBio();
        player2 = choosePlayer(count++);
        player2.myBio();
        while (player1.getPv() != 0 && player2.getPv() != 0) {
            if (count % 2 == 0) {
                player1.makeDamage(player2);
            }
            player2.makeDamage(player1);

        }
    }

    Player choosePlayer(int count) {
        System.out.printf("Première étape, Choix du type de joueur pour le joueur %d: \n", (count + 1));
        System.out.println("1) Elf /// 2) Humain");
        int selector = scanner.nextInt();
        System.out.println("Parfait, quel nom veux tu lui donner ? ");

        String namePlayer = scanner.next();
        System.out.println("Cool, et maintenant combien de PV a ton personnage ? ");
        int pvPlayer = scanner.nextInt();
        Player player1 = null;
        if (selector == 1) {
            player1 = new Elf(namePlayer, pvPlayer);
        } else {
            player1 = new Human(namePlayer, pvPlayer);
        }
        return player1;
    }
}