package Day14.Lambda;

import java.util.ArrayList;

public class lambda_Driver {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(11);
        a.add(20);
        a.add(32);

        a.forEach(n->{if(n%10==0)
            System.out.println(n);
        });

        a.forEach(n-> System.out.println(n));
    }
}
