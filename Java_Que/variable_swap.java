// Variable Swap: Write a program to swap two integer variables, a = 5 and b = 10, using a 
// third temporary variable.

import java.util.Scanner;
public class variable_swap {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first element: ");
        int a = sc.nextInt();

        System.out.print("Enter the second element: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }   
}
