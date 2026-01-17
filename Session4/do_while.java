/*Calculator Menu: Write a program to display a menu for a simple calculator (e.g., "1. Add, 2. Subtract, 3. Exit"). The program should always show the menu at least once and perform the calculation
 until the user selects "Exit". */
/* 
import java.util.Scanner;
public class do_while {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
                do{
            System.out.println("Menu.    1.Add, 2.Subtract,3.Exit");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Enter num1");
                int num1 = sc.nextInt();
                System.out.println("Enter num2: ");
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                
                System.out.println("Addition is: "+ sum);
            }
            else if(n==2){
                System.out.println("Enter num1");
                int n1 = sc.nextInt();
                System.out.println("Enter num2: ");
                int n2 = sc.nextInt();
                int sub = n1 - n2;
                System.out.println("Subtarction is: "+sub);
            }
            else if(n==3){
                System.out.println("Exit");
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }while(true);          // can use while(!=3);
                   
             }
    }
*/






/*Input Range Validation: Write a program that continually asks the user to enter a number that must be between 10 and 20 (inclusive).
 The loop terminates only when a valid number is entered.*/
 /*import java.util.Scanner;
 public class do_while{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number that must be between 10 and 20: ");
            int num = sc.nextInt();
            if(num>=10 && num<=20){
                System.out.println("The loop is terminated");
                break;
            }          
        }while(true);
    }
 }*/
 //Optional
/*import java.util.Scanner;
public class do_while{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{ 
            System.out.println("Enter the ");
            int num =sc.nextInt();
        }while(num < 10 && num > 20);
         System.out.println("Valid number entered. Loop terminated.");
        sc.close();
    }
}    */





/*Conditional Single Run: Write a program to accept a number from the user inside the do-while loop. Only in the first iteration, 
print the number and check if it's even. Then, immediately stop the loop. */
/* 
import java.util.Scanner;
public class do_while{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the input: ");
            n = sc.nextInt();
            if(n%2==0){
                System.out.println("Even");
                break;
            }
            else{
                System.out.println("Odd");
                break;
            }
        }while(n>0);
        System.out.println("The loop ended");
    }
}  */





/*Positive Average: Write a program to prompt the user to enter numbers. Calculate and print the average of all positive numbers entered. 
The loop should stop when the user enters 0. */
/* 
import java.util.Scanner;
public class do_while{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int count = 0;
        int avg;
        
        do{
            System.out.println("Enter n: ");
            n = sc.nextInt();
            if(n>0){
            sum = sum + n;
            System.out.println("The sum of positive numbers is: "+sum);
           // avg = sum/count;
            count++;
        //    System.out.println("The average is: "+avg);
        
            }
        }while(n>0);
         avg = sum/count;
                     System.out.println("The average is: "+avg);

        //System.out.println(avg(sum));
        System.out.println("The loop stopped because user entered 0");
    }
}




/*Largest Even Seeker: Write a program that accepts a series of positive integers from the user until the user enters -1. 
Find and print the largest even number entered (excluding -1). The program must execute the loop body at least once.
 */
import java.util.Scanner;
public class do_while{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        int largest;
        do{
            System.out.println("Enter the positive numbers: ");
            n = sc.nextInt();
         //   System.out.println(n);
            if(n%2==0){
                
            }
            
        }while(n>=0);

        System.out.println(largest);
    }
}