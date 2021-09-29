/*
Suganuma 2021.09.29
*/
public class MyDiary {
    public static void main(String[] args) {
        System.out.println("ようこそ、占いの館へ。");
        System.out.println("あなたの名前を入力してください。");
        String name = new java.util.Scanner(System.in).nextLine();
        
        System.out.println("あなたの年齢を入力してください。");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);

        int fortune = new java.util.Random().nextInt(4);
        fortune++;

        System.out.println("占い結果が出ました!");

        System.out.println(age + "歳の" + name + "さんの占い結果は" + fortune + "です。");
    }
}