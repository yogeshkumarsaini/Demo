import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formating {
    public static void main(String[] args) {
        LocalDate l=LocalDate.now();
        System.out.println(l);
        DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s=l.format(d);
        System.out.println("current date in userdefined formate: "+s);
    }
}
