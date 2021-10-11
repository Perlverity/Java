public class Main1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i + 1).append(",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
        for (String all : a) {
            System.out.println(all);
        }

        String path = concatPath("java¥", "readme.txt");
        System.out.println(path);
    }

    public static String concatPath(String folder, String file) {
        if (!folder.endsWith("¥")) {
            folder += "¥";
        }
        return folder + file;
    }
}