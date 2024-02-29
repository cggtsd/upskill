package thisreference;

public class ThisReferenceDemo {
    void process(){
        doOperate(30, i-> {
            System.out.println(30+i);
            System.out.println(this);
         });
    }
    public static void main(String[] args) {
      int b=30;
     new ThisReferenceDemo().process();
    }

    private static void doOperate(int i, Operation o) {
        o.operate(i);
    }
}
