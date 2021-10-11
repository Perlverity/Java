public class Main3 {
    public static void main(String[] args) {
        try {
            throw new IllegalStateException("未対応のファイルです。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
