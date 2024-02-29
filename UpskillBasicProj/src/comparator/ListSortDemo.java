package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        // Collections.sort(list);//ascending
        // Collections.reverse(list);//descending
        // System.out.println(list);

        // list.stream().sorted().forEach(System.out::println);
        // list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employee> employees = EmployeeDatabase.getEmployees();

        // Collections.sort(employees, (o1, o2) ->(int) (o2.getSalary()-o1.getSalary()));
        
        // System.out.println(employees);
        // employees.stream().sorted((o1, o2) ->(int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
        // employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        
    }


}

// class MyComparator implements Comparator<Employee>{

//     @Override
//     public int compare(Employee o1, Employee o2) {
//         return (int) (o2.getSalary()-o1.getSalary());
//     }

// }
