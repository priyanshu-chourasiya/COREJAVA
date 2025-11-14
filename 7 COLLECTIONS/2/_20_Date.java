
import java.time.LocalDate;
import java.time.LocalTime;

public class _20_Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();    
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());

        LocalDate dob = LocalDate.of(2004, 11, 05);
        System.out.println(dob);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getMinute());
    }
}
