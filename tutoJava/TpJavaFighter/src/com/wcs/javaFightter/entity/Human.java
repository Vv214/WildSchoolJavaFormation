package TpJavaFighter.src.com.wcs.javaFightter.entity;

public class Human extends Player {
    public Human(String name, int pv) {
        super(name, pv);
    }

    public void myBio() {
        System.out.printf("Oyez braves Messires !!! %s, pour vous servir. \n", this.getName());
    }

    public int attack1() {
        int damage = 2;
        System.out.printf(this.getName() + " donne un coup de hache.\n");
        return damage;
    }

    public int attack2() {
        int damage = 4;
        System.out.printf(this.getName() + ", sort son glaive et assène un coup à son adversaire\n");
        return damage;
    }

    public int attack3() {
        double random = Math.floor((Math.random() * 10));
        int damage = (int) random;
        System.out.printf(this.getName()
                + ", trébuche et donne un coup critique à son adversaire\n");
        return damage;
    }
}
