// //1929
// // Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// // Specifically, ans is the concatenation of two nums arrays.

// // Return the array ans.

 

// // Example 1:

// // Input: nums = [1,2,1]
// // Output: [1,2,1,1,2,1]
// // Explanation: The array ans is formed as follows:
// // - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// // - ans = [1,2,1,1,2,1]
// // Example 2:

// // Input: nums = [1,3,2,1]
// // Output: [1,3,2,1,1,3,2,1]
// // Explanation: The array ans is formed as follows:
// // - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// // - ans = [1,3,2,1,1,3,2,1]


// import java.util.Arrays;
// import java.util.Scanner;
// public class que{
//     public static void main(String[]args){
//         int nums[] = {1,2,1};
//         int nums2[] = new int[2*nums.length];
//         int n = nums.length;

//         for(int i = 0 ;i<nums.length;i++){
//         System.out.print(nums[i]+" "+nums[i+n]);
//         }
//         }
//     }

 
//Write a Java program (or just the core logic inside main) to print numbers from 1 to 5 using a for loop.

// import java.util.Scanner;
// public class que{
//     public static void main(String[]args){
//         int n =5;
//         int sum =1;
//     for(int i=1;i<=n;i++){
//         sum = sum*i;
//       //  System.out.print(sum+" ");
//     }
//             System.out.print(sum+" ");

//     }
// }



// Write Java code to find the largest element in an integer array.

// Given:

// int[] arr = {3, 7, 2, 9, 5};



// import java.util.Scanner;
// public class que{
//     public static void main(String[]args){
//      int[] arr = {3, 7, 2, 9, 5};
//      int max = Integer.MIN_VALUE;
//      for(int i=0;i<arr.length;i++){
//         if(arr[i]>max){
//             max = arr[i];
//         }
//      }
//                  System.out.print(max);


//     }
// }





// Write Java code to count how many even and odd numbers are present in an array.

// Given:

// int[] arr = {1, 2, 3, 4, 5, 6};


// Expected output:

// Even = 3
// Odd = 3

import java.util.Scanner;
public class que{
    public static void main(String[]args){
 int[] arr = {1, 2, 3, 4, 5, 6};
 int e_count = 0;
 int o_count =0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e_count ++;
            }
            else if(arr[i]%2 != 0){
                o_count++;
            }
        }
        System.out.println("Even = "+e_count);
            System.out.println("Odd = "+o_count);


    }
}