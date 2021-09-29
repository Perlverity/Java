public class P42 {
    public static void main(String[] args) {
        int[] moneyList = {1000, 2000, 3000};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for(int value: moneyList) {
            System.out.println(value);
        }
    }
}