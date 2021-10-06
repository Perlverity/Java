public abstract class Character {
    String name;
    int hp;

    // 逃げる
    public void run() {
        System.out.println(this.name + "は、逃げ出した!");
    }

    // 闘う
    public abstract void attack(Matango m);
}
