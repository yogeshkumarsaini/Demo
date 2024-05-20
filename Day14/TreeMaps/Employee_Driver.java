import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Employee_Driver {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Map<String, List<Employee>> map3 = new HashMap<>();

        Employee employee = new Employee(1, "Yogesh", "dev");
        Employee employee1 = new Employee(2, "Krishna", "dev");
        list.add(employee);
        list.add(employee1);
        map3.put("Tech", list);
        System.out.println(map3);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
