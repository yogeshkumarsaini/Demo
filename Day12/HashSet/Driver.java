package HashSet;

import Arraylist.EmployeeId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Set<Employee> s=new HashSet<>();

        Employee e1=new Employee(sc.nextInt(),sc.nextLine(),sc.nextLine());
        Employee e2=new Employee(sc.nextInt(),sc.nextLine(),sc.nextLine());

        s.add(e1);
        s.add(e2);
        System.out.println(s);

        // To remove the element in HashSet
        s.remove(e2);
        System.out.println(s);

// To check hashset is empty or not
        System.out.println(s.isEmpty());

//To check the size of hashset
        System.out.println(s.size());


    }
}
