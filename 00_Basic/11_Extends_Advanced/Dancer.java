public class Dancer extends Character{
    public Dancer(String name) {
        this.name = name;
    }

    public void dance() {
        System.out.println(this.name + "は、踊った");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ!");
        m.hp -= 3;
    }
}
