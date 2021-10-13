public class Hero2 implements Cloneable {
    String name;
    int hp;
    Sword sword;

    public Hero2(String name) {
        this.name = name;
    }

    public Hero2 clone() {
        Hero2 result = new Hero2();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
}
