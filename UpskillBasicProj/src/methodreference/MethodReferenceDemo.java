package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

    //    Runnable r= ()->System.out.println("this is my thread");
        //   Runnable r=()->MethodReferenceDemo.myRun();
        Runnable r = MethodReferenceDemo::myRun;
       
          executorService.execute(r);


          List<Integer> intList = List.of(1,4,9,16,25);
          List<Double> squareRootList=MethodReferenceDemo.getSqaureRoot(intList,Double::new);
          squareRootList.forEach(n->System.out.println(n));


          List<Person> personList = List.of(new Person("ABC",40),new Person("XYZ",25),new Person("PQR",22));

          System.out.println("----------------------------------");
          List<String> nameList=MethodReferenceDemo.getPersonName(personList,Person::getName);
          nameList.forEach(n->System.out.println(n));


          System.out.println("------------------------------");
          List<String> names = List.of("Fareeha","Ganga","Bhavani","Divya","Sindhu");
          names.forEach(System.out::println);
    }

    private static List<String> getPersonName(List<Person> personList, Function<Person,String> f) {
        ArrayList<String> result = new ArrayList<>();
        personList.forEach(s->result.add(f.apply(s)));

        return result;
    }

    private static List<Double> getSqaureRoot(List<Integer> intList, Function<Integer,Double> f) {
         ArrayList<Double> result = new ArrayList<>();
         intList.forEach(n->result.add(Math.sqrt(f.apply(n))));
          return result;
    }

    private static void myRun(){
        System.out.println("this is my thread");
    }


    
}
