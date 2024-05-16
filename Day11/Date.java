import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {
        // String s="2024-09-01";
        // DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        // LocalDate localDate =LocalDate.parse(s);
        // String s2=localDate.format(dateTimeFormatter);
        // System.out.println(s2);
        LocalDate date1 = LocalDate.of(2023, 1, 13);
        System.out.println(date1.isLeapYear());
    }
}