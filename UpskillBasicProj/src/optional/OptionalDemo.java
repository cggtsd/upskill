package optional;

import java.util.Arrays;
import java.util.Optional;

import map.Customer;
import map.EcartDatabase;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(12,"abc" ,null, Arrays.asList("198721987","98707283495"));
        
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        // Optional<String> emailOptional = Optional.of(customer.getEmail());
        // System.out.println(emailOptional);


        // Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        // System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email does not exist")));
        System.out.println(getCustomerByEmailId("abc@gmail.com"));
    }
    static Customer getCustomerByEmailId(String emailId) throws Exception
    {
       return EcartDatabase.getAll().stream().filter((c)->c.getEmail().equals(emailId)).findAny().orElseThrow(()->new Exception("customer does not exists with this email id"));
    }
}
