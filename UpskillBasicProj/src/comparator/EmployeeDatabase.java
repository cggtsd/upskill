package comparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees() {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000));
        list.add(new Employee(388, "Vikas", "CIVIL", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee(624, "Sourav", "CORE", 400000));
        list.add(new Employee(177, "Prakash", "SOCIAL", 1200000));
        return list;
    }
}