import java.util.Arrays;
import java.util.Scanner;
class Array_Deletion{
    public static void main(String args[]){
        int arr[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n(no. of actual elements): ");
        int n = sc.nextInt();
            int actual_values [] = new int[n];

       // int actual_value [] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elments at position: " + i );
            actual_values[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(actual_values));
    }
}