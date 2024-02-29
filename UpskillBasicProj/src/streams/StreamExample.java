package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import methodreference.Person;

public class StreamExample {
    public static void main(String[] args) {
        
      String [] arr=  new String[]{"aa","bb","cc","dd","ee"};

      Stream<String> stream = Arrays.stream(arr);
      stream.forEach(System.out::println);

      System.out.println(("---------------------------"));
      Stream<String> of = Stream.of("abc","def","uvw","xyz");
      of.forEach(System.out::println);

      System.out.println(("---------------------------"));
      List<Integer> intList = List.of(1,2,3,5,6,7,8,9);
      intList.stream().forEach(System.out::println);

      System.out.println(("---------------------------"));
       List<Person> list = new ArrayList<>();
	   list.add(new Person("PK",23));
	   list.add(new Person("KK",26));
	   list.add(new Person("MK",23));
	   list.add(new Person("SK",21));
	   list.add(new Person("RK",20));
	   list.add(new Person("BK",30));

       list.parallelStream().forEach(p->doWork(p));
    }

    private static void  doWork(Person p) {
       System.out.println(p);
    }
}
