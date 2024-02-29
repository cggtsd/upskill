package functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class RandonNumber {
    private static Random random;
    public static void main(String[] args) {

        Supplier s= RandonNumber::randomNumber;
        for(int i=0;i<10;i++){
        System.out.println(s.get());
        }
    }
    static int  randomNumber(){
     Random   random = new Random ();
     return random.nextInt(100);
    }
}
