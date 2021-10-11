import java.time.*;

public class Main10 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021,10,9);
        LocalDate d2 = LocalDate.of(2021,10,13);

        Period p1 = Period.ofDays(4);
        Period p2 = Period.between(d1, d2);

        System.out.println("p1:" + p1 + " p2:" + p2);

        LocalDate d3 = d2.plus(p2);
        System.out.println("d3:" + d3);
    }
}
