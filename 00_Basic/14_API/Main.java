public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero.money = 300;
        System.out.println(Hero.money);
        h2.money = 150;
        System.out.println(Hero.money);
    }
}
