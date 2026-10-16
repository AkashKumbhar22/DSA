/* 
Given a number N: Iterate 1 to N:
print "FirstBuzz" if i is a multiple of both 3 and 5
print "Fizz" if i is a multiple of only 3
print "Buzz" if i is a multiple of only 5
Otherwise print the value of 1
*/

import java.util.Scanner;
public class FirstBuzz{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
                int N = sc.nextInt();
        for(int i =1;i<=N;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FirstBuzz");
            }
            else if(i%3==0){
                 System.out.println("Fizz");
            }
            else if(i%5==0){
                 System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}