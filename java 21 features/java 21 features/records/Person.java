package records;

public record Person(int id, String name, String address, String phoneNumber) {
    // getters
    // hashCode
    // equals
    // toString
    public Person(String name, String address) {
        this(14, name, address, null);
    }

    public void displayName() {
        System.out.println("Hello " + name);
    }

    public static void justTest() {
        System.out.println("this is testing static method");
    }
}
