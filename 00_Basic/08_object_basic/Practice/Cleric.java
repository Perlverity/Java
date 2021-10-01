import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた!");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した!");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は、" + sec + "秒間天に祈った!");

        // 理論上の回復量を乱数を用いて決定する
        int recover = new Random().nextInt(3) + sec;

        // 実際の回復量を計算する
        int recoverActural = Math.min(this.MAX_MP - this.mp, recover);

        this.mp += recoverActural;
        System.out.println("MPが" + recoverActural + "回復した!");
        return recoverActural;
    }
}