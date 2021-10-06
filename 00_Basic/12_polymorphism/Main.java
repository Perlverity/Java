public class Main {
    public static void main(String[] args) {
        Wizzard w = new Wizzard();
        Matango m = new Matango();
        Character c = w;
        c.name = "アサカ";
        c.attack(m);
        c.fireball(m);
    }
}
