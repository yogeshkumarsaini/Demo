import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculate_which_day_is_Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
        String dob = sc.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date = LocalDate.parse(dob, dtf);
            String result = date.format(DateTimeFormatter.ofPattern("EEEE"));
            System.out.println("Your Birthday day is :" + result);
        } catch (Exception e) {
            System.out.println("please pass the date in proper format");
        }

    }
}
