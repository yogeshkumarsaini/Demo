package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Employee: ");

        ArrayList<Employee> a = new ArrayList<>();

        Employee e1 = new Employee(sc.nextInt(), sc.nextLine(), sc.nextLine());
        Employee e2 = new Employee(sc.nextInt(), sc.nextLine(), sc.nextLine());
        Employee e3 = new Employee(sc.nextInt(), sc.nextLine(), sc.nextLine());

//To add the element in arraylist
        a.add(e1);
        a.add(e2);
        a.add(e3);
       System.out.println(a);

// To remove the element in arraylist
        a.remove(e2);
        System.out.println(a);

// To check arraylist is empty or not
        System.out.println(a.isEmpty());

//To check the size of arraylist
        System.out.println(a.size());

// To covert the arraylist into sublist
        System.out.println(a.subList(1,3));

//        To sort the Employee by name
        Collections.sort(a, new EmployeeName());
       System.out.println(a);

//       To sort the Employee by id
        Collections.sort(a,new EmployeeId());
        System.out.println(a);
    }
}
