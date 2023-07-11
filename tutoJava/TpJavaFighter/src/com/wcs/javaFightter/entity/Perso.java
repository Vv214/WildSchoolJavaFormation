package TpJavaFighter.src.com.wcs.javaFightter.entity;

abstract class Perso {
    private String name;
    private int pv;

    Perso() {
        this.name = "toDefine";
        this.pv = 1;
    }

    Perso(String name, int pv) {
        this.name = name;
        this.pv = pv;
        // if (this.pv < 1) {
        // throw new InvalidPVException("pv must be an integer greater than 0");
        // }
        // if (this.name.isEmpty()) {
        // throw new EmptyNameException("name must not be empty");
        // }
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
