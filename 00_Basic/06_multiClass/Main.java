public class Main {
    public static void main(String[] args) {
        int[] heights = {50, 20, 80, 40, 25};
        java.util.Arrays.sort(heights);
        for(int h: heights) {
            System.out.println(h);
        }
    }
}