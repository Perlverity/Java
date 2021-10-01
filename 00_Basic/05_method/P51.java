public class P51 {
    public static void main(String[] args) {
        introduceOneself();
        String title = "お誘い";
        String address = "example.com";
        String text = "用件";
        email(title, address, text);
        email(address, text);

        double traiangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積:" + traiangleArea);

        double circleArea = calcCircleArea(5.0);
        System.out.println("円の面積:" + circleArea);
    }

    public static void introduceOneself() {
        String name = "Suga";
        int age = 30;
        double height = 168.8;
        char zodiac = '虎';
        System.out.println(name + age + height + zodiac);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }

    public static double calcTriangleArea(double bottom, double height) {
        double area = (bottom * height) / 2.0;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = radius * radius * 3.14;
        return area;
    }
}