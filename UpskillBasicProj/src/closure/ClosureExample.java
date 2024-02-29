package closure;

public class ClosureExample {
    public static void main(String[] args) {
         int x= 40,y=50;

         doOperate(x, i->{
            //y=300;
            System.out.println(i+y);
         });
    }

    private static void doOperate(int i, Operation o) {
        o.operate(i);
    }
}
