public class Main {
    public static void main(String[] args) {
        System.out.println("メソッド前");
        hello("suga");

        System.out.println("メソッド後:" + add(100, 50));

        System.out.println("メソッド後:" + add(100.5, 50.2));

        System.out.println("メソッド後:" + add("100", "50"));

        System.out.println(add(add(10, 20), add(20, 30)));

        System.out.println("メソッド後:" + add(10, 20, 30));

        int[] array = {1, 2, 3};
        pointArray(array);
    }

    public static void hello(String name) {
        System.out.println("こんにちは。" + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static void pointArray(int[] array) {
        for (int element:array) {
            System.out.println(element);
        }
    }
}