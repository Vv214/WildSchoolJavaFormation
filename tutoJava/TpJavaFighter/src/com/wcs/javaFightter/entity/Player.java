package TpJavaFighter.src.com.wcs.javaFightter.entity;

public abstract class Player extends Perso implements Attaque {

    public Player() {
    }

    public Player(String name, int pv) {
        super(name, pv);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void myBio() {
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

    public int chooseAttack() {
        int choix = 0;
        select = scanner.nextInt();
        if (select == 1) {
            attaque.attaque1();
        } else if (select == 2) {
            attaque.attaque2();
        } else if (select == 3) {
            attaque.attaque3();
        } else {
            System.out.println("Ton joueur n'a que 3 attaques merci donc de choisir entre 1 et 3 > ");
            
        }
        return choix;
    }

    public void makeDamage(Player player2) {
        int damage = chooseAttack();
        int pvP2 = player2.getPv();
        player2.setPv(pvP2-damage);
    }

}
