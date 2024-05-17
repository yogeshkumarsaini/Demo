package Arraylist;

import java.util.Comparator;

public class EmployeeId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getId(),e2.getId());
    }
}
