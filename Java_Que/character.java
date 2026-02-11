import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First alphabet of name: ");
        char name = sc.next().charAt(0);

        System.out.println("You Entered: "+name);
    }
}
