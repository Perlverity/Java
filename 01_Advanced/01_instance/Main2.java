import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};

        System.out.println("誤った判定:" + a.equals(b));
        System.out.println("正しい判定:" + Arrays.equals(a, b));
    }
}
