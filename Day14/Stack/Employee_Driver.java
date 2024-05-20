package Day14.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Employee_Driver {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(1, "Yogesh", "dev");
        Employee employee1 = new Employee(2, "Ganesh", "Dev");

        list.add(employee);
        list.add(employee1);

        Stack<List<Employee>> s = new Stack<>();
        s.push(list);
        System.out.println(s);
        s.push(list);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.iterator();
        System.out.println(s);
    }
}
