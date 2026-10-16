/*Odd Multipliers Table: Print the multiplication table for a number X=9 up to 10, but only for the odd multipliers (e.g., 9 \times 1, 9 \times 3, 9 \times 5, \dots).
 
public class odd_multipers {
    public static void main(String[]args){
        int X=9;
        for(int i=1;i<=10;i++){
            if(i%2 != 0)
            System.out.println(X + "x" + i + "=" +X * i);
        }
    }
}
*/





/*Count Even Digits: Write a program to count the total number of even digits in an integer Y=123456
import java.util.Scanner;
public class odd_multipers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the digit: ");
        int Y = sc.nextInt();
        int count =0;
        for(;Y>0;Y=Y/10){
                int digit = Y%10;
                if(digit%2==0){
                    System.out.println(digit);
                    count ++;
                }
                            }
              System.out.println("The total number of even digits in an intege");
        }
    }
*/





/*Skip-Reverse a String: Write a program to print the characters of the string "LoopPractice" in reverse order, but skip every second character 
(e.g., print 'e', 'i', 'c', 'r', 'p', 'o') 
import java.util.Scanner;
public class odd_multipers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String name = "LoopPractice";
        for(int i = name.length()-1;i>=0;i=i-2){
        System.out.println(name.charAt(i));
        }
         }
}
*/





/*Fibonacci by Limit: Write a program to print the Fibonacci series until the number exceeds 50 
import java.util.Scanner;
public class odd_multipers {
    public static void main(String[]args){
        int a = 0;
        int b=1;
        int sum =0;
        for(;sum<=50;){
            sum = a+b;
            a = b;
            b = sum;
             System.out.println(sum);
        }
       // System.out.println(sum);
    }
}
*/




/*Power Play: Calculate A^B, where A=4 and B=3, without using the Math.pow() function 
import java.util.Scanner;
public class odd_multipers {
    public static void main(String[]args){
        int A = 4;
        int B = 3;
        int sum = 1;
        for(int i=1;i<=B;i++){
                    //int m = A *B;
                    sum = sum * A;
                        
                       
                        //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
    */



/*Vowel ASCII: Write a program to print the ASCII values for all uppercase and lowercase vowels ('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u').
 */
/*import java.util.Scanner;
public class odd_multipers{
    public static void main(String[]args){
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for(char v : vowels){
            int ascii = (int) v;
            System.out.println(v + " = " + ascii);
        }
    }

}*/