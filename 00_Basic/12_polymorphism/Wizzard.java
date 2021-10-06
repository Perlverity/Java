public class Wizzard extends Character {
    int mp;
    
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃!");
        System.out.println("敵に5ポイントダメージ!");
        m.hp -= 5;
    }

    public void fireball(Matango m) {
        System.out.println(this.name + "のfireball");
        System.out.println("敵に20ポイントダメージ!");
        m.hp -= 20;
        this.mp -= 5;
    }
}
