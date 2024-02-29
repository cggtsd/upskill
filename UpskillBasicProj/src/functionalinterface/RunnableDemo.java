package functionalinterface;

public class RunnableDemo {
    
    public static void main(String[] args) {
        // Runnable r = new Runnable() {

        //     @Override
        //     public void run() {
        //        System.out.println("This is runnable demo");
        //     }
            
        // };

        Thread thread = new Thread(()->System.out.println("This is runnable using lambda"));

        thread.start();

    }
}
