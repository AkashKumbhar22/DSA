import java.util.Scanner;
public class Even {
    boolean isEven(int n){
       return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
        Even obj = new Even();

        boolean result = obj.isEven(n);
        System.out.println(result);
    }
}
