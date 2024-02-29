package functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
       Predicate<Integer> predicate= t->t%2==0;

       System.out.println(predicate.test(7));


       List<Integer> list = List.of(1,2,3,4,5);
       System.out.println("-------------------------------------");
       list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
    }
}
