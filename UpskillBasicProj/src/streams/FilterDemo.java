package streams;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
       List<String> list= List.of("Divya","Fareeha","Sindhu","Sam","Ganga","Sindhuja");

       Stream<String> filteredNames = list.stream().filter(n->n.startsWith("S"));
       filteredNames.forEach(System.out::println);

       Map<Integer, String> map = Map.of(1,"a",2,"b",3,"c",4,"d");
       map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(System.out::println);
    }
}
