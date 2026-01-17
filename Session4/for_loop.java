package Session4;
/* 
public class for_loop{
    public static void main(String[]args){
    //print 1 to 10
    for(int i=0; i<=10;i++){
        System.out.println(i);
        }
    }
}  */

/*Program to print even*/
/*public class for_loop{
    public static void main(String[]args){
        int n = 10;
        for(int i=1;i<=10;i++){
            System.out.println(2*i);
        }
    }
} */

/*Program to print odd numbers*/
/*public class for_loop{
    public static void main(String[]args){
        int n = 10;
        for(int i=1;i<=n;i+=2){
            System.out.println(i);
        }
    }
} */

//OR

import java.util.Scanner;
public class for_loop{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. until which you want the odd numbers:");
        int n= sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }  
    }
}

/*Print Multiples of 3: Write a program to print all integers from 1 to 100 that are divisible by 3. 

public class for_loop{
    public static void main(String[]args){
        
        for(int i=0;i<=100 ;i++){
            if(i%3==0){
            System.out.println(i);}
        }
    }
} */

/*Double Conditionals: Write a program to print all numbers between 20 and 50 (inclusive) that are divisible by both 3 and 5. 

public class for_loop{
    public static void main(String[]args){
                for(int i=20;i<=50 ;i++){
            if(i%3==0 && i%5==0){
            System.out.println(i);}
        }
    }
}  */
/*Sum of Squares: Calculate and print the sum of the squares of the first N=15 natural numbers. */

