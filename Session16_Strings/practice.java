//Given a positive int,find the sum of its first digit and last digit
import java.util.Scanner;
import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the positive number: ");
        int num = sc.nextInt();

        String change = Integer.toString(num);

        int a = change.charAt(0);
        a = a - (int)'0';

        int b = change.charAt(change.length()-1);
        b =  b - (int)'0';

        System.out.println("The sum of first and last digit is: "+ (a+b));
    }
}
