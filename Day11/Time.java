import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+ time);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+ current);
    }
}
