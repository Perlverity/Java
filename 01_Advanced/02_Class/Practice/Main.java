public class Main {
    public static void main(String[] args) {
        StrongBox<String> sb = new StrongBox<String>(KeyType.DIAL);
        sb.get();
        System.out.println(sb);
    }
}
