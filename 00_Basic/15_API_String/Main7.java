import java.util.Date;

public class Main7 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(16000L);
        System.out.println(past);
    }
}
