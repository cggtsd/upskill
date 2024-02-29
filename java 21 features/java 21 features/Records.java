record User(int userId, String name) {
}

class Test {
    public void testing(Object ob) {
        if (ob instanceof User(int userId, String name)) {
            System.out.println("User id " + userId);
        System.out.println("Username "+name);
      }  
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.testing(new User(1341,"Fathima"));
    }
}
