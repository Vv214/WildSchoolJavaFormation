package TpJavaFighter.src.com.wcs.javaFightter.entity;

public class Elf extends Player {
    public Elf(String name, int pv) {
        super(name, pv);
    }

    public void myBio() {
        System.out.printf(
                "La paix est ce qu'il y a de mieux, par contre mort aux Orcs ! Je me présente %s, pour vous servir\n",
                this.getName());
    }

    public int attack1() {
        int damage = 2;
        System.out.printf(this.getName() + ", lance une flèche qui touche dans le mille comme d'habitude\n");
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
                + ", fait appel à la force superieur de la nature et  entre dans un état second avant de pourfendre son adversaire\n");
        return damage;
    }
}
