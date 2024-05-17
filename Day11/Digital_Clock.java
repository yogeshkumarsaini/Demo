import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Digital_Clock{
    public static void main(String[] args){
        while(true){
            LocalDateTime l=LocalDateTime.now();
            DateTimeFormatter d=DateTimeFormatter.ofPattern("HH:mm:ss");
            String s=l.format(d);
            System.out.println(s);
            
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
