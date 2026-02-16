import java.util.Scanner;
public class Input_str {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.print("Enter name: ");

        String name = ak.next();

        //When we use "next()" we dont get the value after the spaces
        System.out.println("Your name is: " + name);

        ak.nextLine();
        //When we use the "nextLine()" we get everything which is written
        System.out.print("Enter your full name: ");
        String fullname = ak.nextLine();
        System.out.println("Your Full name is: " + fullname);
    }
}
