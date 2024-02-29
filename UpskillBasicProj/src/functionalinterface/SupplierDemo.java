package functionalinterface;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
      Supplier<String> supplier=  ()->"Hi All";
      System.out.println(supplier.get());

      System.out.println("-------------------------------");
      List<String> list = List.of();
      System.out.println(list.stream().findAny().orElseGet(()->"Hi All"));
      //System.out.println(()->"Hi All");

      Supplier<Object> j=()->LocalDateTime.now();
      System.out.println(j.get());


    }
    
}
