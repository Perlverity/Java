public class Main2 {
    public static void main(String[] args) {
        String s1 = "Java and JavaScript";
        if (s1.contains("Java")) {
            System.out.println("OK1");
        }
        if (s1.endsWith("Java")) {
            System.out.println("OK2");
        }
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.lastIndexOf("Java"));
    }
}
