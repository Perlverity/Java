import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mori");
        names.add("Kita");
        names.add("Nishi");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }
}
