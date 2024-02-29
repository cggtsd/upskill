package comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MapSortDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("eight", 8);
        hashMap.put("four", 4);
        hashMap.put("ten", 10);
        hashMap.put("two", 2);

        // ArrayList<Entry<String, Integer>> entries = new
        // ArrayList<>(hashMap.entrySet());

        // Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));

        // for (Entry<String, Integer> entry : entries) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        // hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // System.out.println("-------------------------");
        // hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // TreeMap<Employee, Integer> empMap = new TreeMap<>(( o1,  o2)-> (int) (o2.getSalary() - o1.getSalary()));
           
        TreeMap<Employee, Integer> empMap = new TreeMap<>();
        empMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        empMap.put(new Employee(388, "Vikas", "CIVIL", 900000), 90);
        empMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        empMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        empMap.put(new Employee(177, "Prakash", "SOCIAL", 1200000), 120);

        // System.out.println(empMap);
        Stream<Entry<Employee, Integer>> sorted = empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)));
        sorted.forEach(System.out::println);
        System.out.println("----------------------------------");
        empMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
        .forEach(System.out::println);

    }
}
