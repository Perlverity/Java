import java.time.*;
import java.time.format.*;

public class Main9 {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2021/10/09", fmt);

        // 1000日後を計算する
        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は、" + str);

        // 現在日付との比較
        LocalDate now = LocalDate.now();
        if (now.isAfter(ldatep)) {
            System.out.println("1000日後は過去日付です。");
        }
    }
}
