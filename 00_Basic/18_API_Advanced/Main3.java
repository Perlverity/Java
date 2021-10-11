import java.io.InputStream;
import java.net.URL;

public class Main3 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://book.impress.co.jp");
            InputStream is = u.openStream();
            int i = is.read();
            while (i != -1) {
                char c = (char) i;
                System.out.print(c);
                i = is.read();
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
