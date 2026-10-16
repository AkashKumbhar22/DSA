public class Greeter {
    void greet(String name){
        System.out.println( "Hello " + name);
    }
    public static void main(String[] args) {
        Greeter obj = new Greeter();
        obj.greet("Akash");

        Greeter obj1 = new Greeter();
        obj1.greet("Vaishnavi");

    }
}
