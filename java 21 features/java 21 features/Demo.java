import java.util.*;
void main(String [] args){
    System.out.println("This main is without class");
    List<String> list=new ArrayList();
    list.addFirst("First Element");
    list.addLast("Last Element");
  
    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    System.out.println(list.reversed());


}