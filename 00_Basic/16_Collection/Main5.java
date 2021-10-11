import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1500);
        prefs.put("福島県", 101);

        int tokyo = prefs.get("東京都");
        System.out.println("東京都の人口は、" + tokyo);

        // prefs.remove("京都府");
        prefs.put("福島県", 2000);

        int fukushima = prefs.get("福島県");
        System.out.println("福島県の人口は、" + fukushima);

        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value);
        }
    }
}
