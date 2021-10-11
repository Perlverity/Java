import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("そ");
            fw.write("れ");
            fw.write("で");
            fw.write("は");
            fw.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
