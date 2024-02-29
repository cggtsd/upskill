package map;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
         List<Customer> customers = EcartDatabase.getAll();

         List<String> emails = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
         emails.forEach(System.out::println);

         List<List<String>> phoneNumbers = customers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        //  phoneNumbers.forEach(System.out::println);
         System.out.println(phoneNumbers);
        
         List<String> phoneNumbers1 = customers.stream().flatMap(c->c.getPhoneNumbers().stream()).collect(Collectors.toList());
        //  phoneNumbers1.forEach(System.out::println);
        System.out.println(phoneNumbers1);
         
    }
}
