import java.time.LocalDate;
import java.time.Period;

public class Date_Difference {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        LocalDate p=LocalDate.of(2000, 8, 23);
        Period a=Period.between(d, p);
        System.out.println(a);
        System.out.println("Total Number of Years: "+a.getYears());
        System.out.println("Total Number of Months: "+a.getMonths());
        System.out.println("Total Number of Days: "+a.getDays());  
      
    }
}
