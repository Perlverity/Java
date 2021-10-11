import java.util.Set;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wold");
        words.add("panda");

        for (String s:words) {
            System.out.print(s + "→");
        }
    }
}
