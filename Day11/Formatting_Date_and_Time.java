import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatting_Date_and_Time {
    public static void main(String[] args) {
        DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);

        String s=t.format(d);
        System.out.println("current date and time in userdefined : "+s);
    }
}
