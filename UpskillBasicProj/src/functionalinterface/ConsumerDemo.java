package functionalinterface;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
       Consumer<Integer> consumer= t->System.out.println("Printing ::: "+t);
       consumer.accept(12);
       System.out.println("------------------------------------");

       List<Integer> intList = List.of(1,2,3,4,5);
       intList.forEach(n->System.out.println(n));

       System.out.println("------------------------------------");
       intList.stream().forEach(n->System.out.println(n));

       Map<String, Integer> courses = Map.of("Java", 3000,"Python",4000,"Spring Boot",6000);

       System.out.println("------------------------------------");
       courses.forEach((k,v)->System.out.println(k+"->"+v));

       System.out.println("------------------------------------");
       courses.entrySet().stream().forEach(obj->System.out.println(obj));

    }
}
