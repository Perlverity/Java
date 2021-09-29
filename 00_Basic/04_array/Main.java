public class Main {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 50, 80};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("平均点は" + avg);
        System.out.println("合計点は" + sum);
    }
}