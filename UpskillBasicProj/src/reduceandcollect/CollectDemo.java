package reduceandcollect;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product(23,"potatoes"),
				new Product(14,"orange"),
				new Product(13,"lemon")
				,new Product(23,"bread"),
				new Product(13,"sugar"));

        //convert stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
	    collect.forEach(System.out::println);

        System.out.println("----------------------------------------");
	    
	    //Reduce to String
	    String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
	    System.out.println(collect2); 

        System.out.println("-----------------------------------");
	    //Average price
	    Double averagePrice = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
	    System.out.println(averagePrice);

        System.out.println("-----------------------------------");
        IntSummaryStatistics collect1 = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
	    System.out.println(collect1);

         System.out.println("-------------------------------");
	     Map<Integer, List<Product>> collect3 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
	    //  collect3.forEach((k,v)->{
	    // 	 System.out.println(k);
	    // 	 System.out.println(v);
	    //  });

        collect3.entrySet().stream().forEach(System.out::println);

        //Dividing stream's element into group's according to some predicate
	     System.out.println("----------------------------------");
	     Map<Boolean, List<Product>> collect4 = productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
	    //  collect4.forEach((k,v)->{
	    // 	 System.out.println(k);
	    // 	 System.out.println(v);
	    //  });
        collect4.entrySet().stream().forEach(System.out::println);

        //Pushing the collector to perform additional transformation
	     System.out.println("------------------------------");
	     Set<Product> collect5 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
	     collect5.forEach(System.out::println);

    }
}
