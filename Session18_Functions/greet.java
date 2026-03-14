// Write a function that:

// takes one number

// returns true if the number is even

// returns false if the number is odd
 import java.util.Scanner;

public class greet {
    boolean greet(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first no. : ");
    int n = sc.nextInt();



        greet obj = new greet();
      boolean result =  obj.greet(n);
      System.out.println(result);
    }
}
