package lambdas;

public class LambdaDemo {
    public static void main(String[] args) {
       Interface1 i1= ()->System.out.println("this is zero param lambda");
       i1.method1(); //calling lambda

       System.out.println("------------------------------");

       Interface2 i2=name->System.out.println("Welcome to "+name);
       i2.method2("CGG");

       System.out.println("------------------------------");

      Interface3 i3= (n,a)->{
        System.out.println("Name "+n);
        System.out.println("Age "+a);
       };
       i3.method3("ABC", 23);

       System.out.println("------------------------------");

    //    Interface4 i4=(a,b)->a+b;
    //    System.out.println("Sum "+i4.sum(4,5));
       Interface4 i4=(a,b)->{
        int c=a+b;
        return c;
       };
       System.out.println("Sum "+i4.sum(4,5));

       System.out.println("------------------------------");

       MyComparator c= (a,b)->a>b;
       System.out.println(c.compare(40,50));

    }
}
