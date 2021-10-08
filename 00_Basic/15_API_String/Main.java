public class Main {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "JAVA";
        String s3 = "java";

        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケース区別しなければ、等しい");
        }
        System.out.println("s1の長さ:" + s1.length());
        if (s1.isEmpty()) {
            System.out.println("空文字です");
        }
    }
}
