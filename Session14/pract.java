//21. Sum of Natural Numbers: Write a loop to calculate the sum of the first 100 natural numbers (1+2+...+100)

// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

// int n = 1000;
// int sum = 0;
//         for(int i=1;i<n;i++){
//                 if(i%3==0 || i%5==0){
//                     sum = sum +i;
//                 }
//         }
//         System.out.print(sum);
//     }
// } 

//233168

// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

// int n = 5;
// int sum = 0;
//         for(int i=1;i<n;i++){
//                sum = n*(n+1)/2;
//         }
//         System.out.print(sum);
//     }
// } 



//Factorial: Write a program to calculate the factorial of a number (e.g., 5! = 54321 = 120). 
// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter tyhe value of n: ");
//         int n = sc.nextInt();
//         int factor = 1;
//         for(int i=n;i>0;i--){
//             factor = factor*i;
//         }
//         System.out.println(factor);
//     }
// } 


// 46. Pattern 1 (Right Triangle): Use nested loops to print a star pattern: 
// * 
// ** 
// *** 
// ****

// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//       int n = 4;
//       for(int rows=1;rows<=n;rows++){
//         for(int columns=1;columns<=rows;columns++){
//             System.out.print("*");
//         }
//         System.out.println();
//       }
//     }
// } 

// 48. Pattern 3 (Numbers): Print a pattern like: 
// 1 
// 12 
// 123 
// 1234 

// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//       int n = 4;
//       for(int rows=1;rows<=n;rows++){
//         for(int columns=1;columns<=rows;columns++){
//             System.out.print(columns);
//         }
//         System.out.println();
//       }
//     }
// } 



// 50. Second Largest: Find the second largest number in an array without sorting it. 
import java.util.Scanner;
public class pract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int arr[]={1,2,3,4,5,6};
    int largest = Integer.MIN_VALUE;
    int sec_large = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            sec_large = largest;
            largest = arr[i];
        }
        else if(arr[i]>sec_large && arr[i] != largest){
            sec_large = arr[i];
        }
    }
    System.out.println(sec_large);
    }
} 
