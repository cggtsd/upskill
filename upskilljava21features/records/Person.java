package records;


public record Person(int id,String name,String address,String phone){

    public Person(String name,String address){
        this(14,name,address,null);
    }

    public void displayName(String n){
         System.out.println("Hello "+this.name);
    }

    public static void justTest(){
        System.out.println("this is testing static method");
    }
}