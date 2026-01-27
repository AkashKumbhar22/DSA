/* 
// Sum all values in an array: Write a Java program to sum values of an array.
import java.util.Arrays;
import java.util.Scanner;
public class arrays_hw{
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int sum=0;

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length;i++){
          //  int sum=0;
            sum = sum + i;
            System.err.println(sum);

        }
        //System.err.println(sum);
    }
} */

//Calculate average of array elements:
//  Write a Java program to calculate the average value of array elements
/* 
import java.util.Arrays;
import java.util.Scanner;
public class arrays_hw{
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int sum=0;

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length;i++){
          //  int sum=0;
            sum = sum + i;
            System.err.println(sum);

        }
        int avg = sum/arr.length;
        System.err.println("The sum of all values in array is: "+sum);
        System.out.println("The average of array element is: "+ avg);
    }
} */



    
//Find index of an element in array: 
// Write a Java program to find the index of an array element.
// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays_hw{
//     public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);

// System.out.print("Enter the size of array: ");
// int size = sc.nextInt();

// int arr1[] = new int[size];

// //taking input
// for(int i=0;i<size;i++){
//     arr1[i] = sc.nextInt();
// }

// System.out.print("Enter the no. to be searched: ");
// int x = sc.nextInt();

// for(int i = 0;i<size;i++){
//     if(x==arr1[i]){
//      System.out.println(i); 
//      System.out.println("true");
//     }
//     }
//     }
// } 


// Insert element at specific position:
//  Write a Java program to insert an element (specific position) into an array.
/*import java.util.Arrays;
import java.util.Scanner;
public class arrays_hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};

        System.out.print("Enter the value of be added: ");
        int value = sc.nextInt();

        System.out.print("Enter the position at which value need to be added(Size(0-4): ");
        int position = sc.nextInt();

        arr[position]=value;
        System.out.println(Arrays.toString(arr));
        
}
} */


// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays_hw{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {1,2,3,4,6};   
//     for(int i = 0;i<arr.length;i++){
//         if(i==0 || i==(arr.length-1)){
//         }
//         else{
//             System.out.print(arr[i]);
//         }

//     }
//     }
// } 



//Take the array size and array elements as inpt from users and also take teh atrget element which is to be searched in the array
//if the element is found in the array print true else print false

// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays_hw{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int size = sc.nextInt();

//         int arr [] = new int[size];
//     for(int i=0;i<size;i++){
//         System.out.print("Enter the element at position "+(i+1)+": ");
//         arr[i]=sc.nextInt();

//     }

//         System.out.print("Enter the target: ");
//         int target = sc.nextInt();

//         boolean result = false;

//    for(int element : arr){
//     if(target == element){
//         result = true;
//         break;
//     }
//    }

//    if(result){
//     System.out.println(result);
//    }
//    else{
//     System.out.println(result);
//    }
// }
// }


import java.util.Arrays;
import java.util.Scanner;
public class arrays_hw{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
       // nums = sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.print("Enter the element " + (i+1)  +" : " );
           //int nums = sc.nextInt();
                   nums[i] = sc.nextInt();
        }
        for(int element : nums){
            System.out.println(element + " ");
        }
    }
}