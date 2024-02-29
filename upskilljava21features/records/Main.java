package records;

public class Main {
    public static void main(String[] args) {
       var person= new Person(12,"Fathima","Hyderabad","9817239872");
       System.out.println(person);

       System.out.println(person.id());
       System.out.println(person.name());
       System.out.println(person.address());
       System.out.println(person.phone());

       person.displayName();
       Person.justTest();

       var person1=new Person("CGG","Delhi");
       System.out.println(person1);
       person1.displayName();
       person1.justTest();
    }
}
