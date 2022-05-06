import java.time.LocalDateTime;
import java.time.Month;

public class exercicio4 {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        System.out.println(Month.from(LocalDateTime.now()));
        System.out.println(Month.of(8));
        System.out.println(Month.SEPTEMBER.getValue());
        System.out.println(Month.OCTOBER.length(true));
        System.out.println(Month.APRIL.compareTo(LocalDateTime.now().getMonth()));
    }
}
