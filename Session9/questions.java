//Mutliple references to same array

// import java.util.Scanner;
// public class questions{
//     public static void main(String[]args){
//         int arr1[]={2,3,4,5};
//         int arr2[]=arr1;

//       //  System.out.println(arr1[0]);
//         //System.out.println(arr2[2]);

//         arr1[2]=69;

//       //  System.out.println(arr2[2]);
//       for(int i=0;i<arr1.length;i++){
//             System.out.println(arr2[i]);
//             System.out.println(arr1[i]);
//       }
//     }
// }


/* 
//Methods -copyof() , toString(),equals(),fill

//copyof() method is used o create the copy of an array
// by copyOf method changes in array1 will not be reflected in copied array

import java.util.Arrays;
import java.util.Scanner;
public class questions{
    public static void main(String[]args){
        int arr1[]={2,3,4,5}; 
        int arr2[]=Arrays.copyOf(arr1,arr1.length); //arr1.length = sets the length same of arr1

            System.out.println(Arrays.toString(arr2));
          
//equals is to check if both arrays have the same values and same order
System.out.println(Arrays.equals(arr1,arr2));


System.out.println("Value of arr2 before the fill method" + Arrays.toString(arr2));
//fill() if all value of the array are same it is used
Arrays.fill(arr2, 5);
System.out.println("Value of arr1 after the fill method" +Arrays.toString(arr2));

    }
} */



//import java.util.Scanner;
// public class questions{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
    
        
//         System.out.println("Enter the number to be searched: ");
//         int x = sc.nextInt();

//         for(int index=0;index<arr.length;index++){
//             if(x==arr[index]){
//                 System.out.println(true);
//                 System.out.println("It is present at the index: " +index);
//             }
//             else{
//                 System.out.println(false);
//             }
//         }
        // for(int index=0;index<arr.length;index++){
        //     System.out.print(arr[index] + " ");
        // }
        // System.out.println(arr.length);

        // //Or

        // for(int element : arr){
        //     System.out.println(element+" ");
        // }

//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;
// public class questions{
//     public static void main(String[]args){
//         int arr1[]={4,5,3,2};
//         int arr2[]={4,5,3,2};
       // System.out.println(Arrays.equals(arr1,arr2));
        // if(arr1==arr2){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("false");
        // }

        // Fill Partial Array
        // int arr[] = new int[7];
        // Arrays.fill(arr,0,7,9);
        // System.out.println(Arrays.toString(arr));
// }
// }

