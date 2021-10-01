public class Main {
    public static void main(String[] args) {
        // Sword s = new Sword();
        // s.name = "炎の剣";
        // s.damege = 10;

        // Hero h = new Hero();
        // h.name = "Perl";
        // h.hp = 100;
        // h.sword = s;
        // System.out.println("現在の武器は" + h.sword.name);
        // h.attack();

        Hero h1 = new Hero("ミナト");

        Hero h2 = new Hero();

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        System.out.println(h1.hp);
        System.out.println(h1.name);
        System.out.println(h2.name);

    }
}