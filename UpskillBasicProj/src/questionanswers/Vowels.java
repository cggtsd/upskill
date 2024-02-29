package questionanswers;

import java.util.List;
import java.util.stream.Collectors;

public class Vowels {
    private static List<String> names;

    public static void main(String[] args) {
        names = List.of("Apple","eagle","Cap","dog","umbrella","Ink");
         names.stream().map(String::toLowerCase).filter(n1->n1.startsWith("a")||n1.startsWith("e")||n1.startsWith("i")||n1.startsWith("o")||n1.startsWith("u")).collect(Collectors.toList()).forEach(System.out::println);;
       
    }
    
}
