/*Squares Count Up: Write a program to print the squares of numbers starting from 1 up to N=7 (i.e., 1, 4, 9, ... 49).
 
ublic class while_loop {
    public static void main(String[]args){
        int N=7;
        int i =1;
      //  int sum =0;
        while(i<=N){
            int a = i*i;
            i++;
           System.out.println(a);}
    }
}
*/





/*Positive Count Until Zero: Write a program to repeatedly prompt the user for input and count the total number of positive integers entered
 until the user enters 0. Print the final count.
 */
import java.util.Scanner;
public class while_loop{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    //int n;
    int count = 0;
   // System.out.println("Enter n: ");
    //    int n = sc.nextInt();
    while(true){
          System.out.println("Enter n: ");
        int n = sc.nextInt();
        if(n>0){
         count++;
          }

        else if(n==0){
            break;
        }       
    }     
    System.out.println(count);
  }
}