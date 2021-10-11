import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt");) {
            int input = fr.read();
            while (input != -1) {
                System.out.println((char)input);
                input = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
