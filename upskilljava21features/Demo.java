import java.util.ArrayList;
import java.util.List;

public static void main(String [] args){
    System.out.println("testing");
    List<String> list=new ArrayList<>();

    list.addFirst("First Element");
    list.add("Elemment2");
    list.add("Elemment3");
    list.add("Elemment4");
    list.addLast("Last Element");

    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    System.out.println(list.reversed());
    System.out.println(list.sort());


}
