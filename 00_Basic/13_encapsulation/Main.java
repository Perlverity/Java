public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミサト");
        h.setHp(5);
        Wizard w = new Wizard();
        Wand wd = new Wand();
        wd.setPower(20);
        w.setWand(wd); //w.setWand(r);
        w.setName("Misato");
        w.heal(h);
    }
}
