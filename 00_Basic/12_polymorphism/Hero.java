public class Hero extends Character {
    public void attack(Monster m) {
        m.hp -= 10;
    }
}
