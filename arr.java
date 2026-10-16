//Declare an array and print all its elements.
/*
public static void main(String[] args){
    int arr[] = {1,2,3};

    for(int i = 0 ; i< arr.length ; i++){
        System.out.println(arr[i]);
    }
} */


//Find the sum of all elements.
// public static void main(String[] args){
//     int arr[] = {1,2,3};
//     int sum = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         sum = arr[i] + sum;
//     }
//     System.out.println(sum);
// }

//Find the average of the elements.
// public static void main(String[] args){
//     int arr[] = {1,2,3};
//     int sum = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         sum = arr[i] + sum;
//     }
//     int avg = sum/arr.length;
//     System.out.println(avg);
// }

// Find the maximum element.
// public static void main(String[] args){
//     int arr[] = {1,2,3};
//    int max = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }
    
//     System.out.println(max);
// }

//Find the minimum element.
// public static void main(String[] args){
//     int arr[] = {2,3,1};
//    int min = arr[0];

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] < min){
//             min = arr[i];
//         }
//     }
//     System.out.println(min);
// }

//Count how many elements are even.
// public static void main(String[] args){
//     int arr[] = {2,3,1,4,5,6};
//    int count = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] % 2 == 0){
//            count++;
//         }
//     }
//     System.out.println(count);
// }

//Count how many elements are odd.
// public static void main(String[] args){
//     int arr[] = {2,3,1,4,5,6};
//    int count = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] % 2 != 0){
//            count++;
//         }
//     }
//     System.out.println(count);
// }


// Search for a given number and print whether it exists.
// public static void main(String[] args){
//     int arr[] = {2,3,1,4,5,6};
//    int search = 3;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] == search){
//             System.out.println(search + " Exists");
//         }
//     }
   
// }

//Count how many times a given number occurs.
// public static void main(String[] args){
//     int arr[] = {2,3,1,4,5,3,3,3,6};
//    int count = 0;
//    int num = 3;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] == num){
//            count++;
//         }
//     }
//     System.out.println(count);
// }

// Print the array in reverse order.
// public static void main(String[] args){
//     int arr[] = {2,3,1,4,5,3,3,3,6};
  

//     for(int i = arr.length-1 ; i=>0 ; i--){
//         System.out.println(arr[i]);
//     } 
// }

//Find the second largest element.
// public static void main(String[] args){
//     int arr[] = {1,2,3,5,99,45};
//    int max = 0;

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] > max ){
//             max = arr[i];
//         }
//     }
//     int sec_max = 0;
//         for(int j = 0 ; j< arr.length ; j++){
//         if(arr[j] > sec_max && arr[j] < max){
//             sec_max = arr[j];
//         }
//     }
    
//     System.out.println(max);
//     System.out.println(sec_max);
// }

//Find the second smallest element.
// public static void main(String[] args){
//     int arr[] = {1,2,3};
//    int min = arr[0];

//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] < min ){
//             min = arr[i];
//         }
//     }
//     int sec_min = Integer.MAX_VALUE;
//         for(int j = 0 ; j< arr.length ; j++ ){

//         if(arr[j] > min && arr[j] < sec_min){
//             sec_min = arr[j];
//         }


//     }
//     System.out.println(min);
//     System.out.println(sec_min);
// }

// Check whether the array is sorted in ascending order.
// public static void main(String[] args){
//     int arr[] = {1,3,2,4};
//     boolean isSorted = true;

    // for(int i = 0 ; i < arr.length-1; i++){
    //     if(arr[i+1] > arr[i] || arr[i+1] == arr[i]){
    //         isSorted = true;
    //     }
    //     else{
    //         isSorted = false;
    //         break;
    //     }
       
    // }
//     if(isSorted==true)
//             System.out.println("It is Sorted");
//         else
//             System.out.println("It is not Sorted");
// }
// int arr[] = {1,3,2,4};


//Same using method
// public class arr{
//     public static boolean isSorted(int[] arr){
//         boolean isSorted = true;
        
//         for(int i = 0; i < arr.length-1 ; i++){
//            if(arr[i+1] > arr[i] || arr[i+1] == arr[i]){
//            isSorted = true;
//         }
//         else{
//             isSorted = false;
//             break;
//         } 
//         }
//         return isSorted;
//     }


//     public static void main(String[] args){
//             int[] arr = {1,4,3,2};

//             boolean result = isSorted(arr);

//             if(result){
//                   System.out.println("It is Sorted");
//             }
//          else{
//              System.out.println("It is not Sorted");
//             }
//     }
// }

//Print only the elements greater than a given number.
// public class arr{
//     public void greater(int a,int arr[]){
      
//         for(int i = 0 ; i< arr.length ; i++){
//             if(arr[i] > a){
//                System.out.println(arr[i]); 
//             }
      
//         }
//     }

//    public static void main(String[] args) {

//         int[] arr = {1, 2, 2, 4, 5};
//         int a = 3;

//         arr ar = new arr();
//         ar.greater(a,arr);
// }
// }

//Find the difference between the maximum and minimum.

// class arr{
// public static int diff(int arr[]){
//        int max = arr[0];
//        int min = Integer.MAX_VALUE;
//     for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }

//     for(int j = 0 ; j< arr.length ; j++){
//         if(arr[j] < min ){
//             min = arr[j];
//         }
//     }
//         return max-min; 
// }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};

//     int result = diff(arr);
//         System.out.println(result );
//     }

// }

//Reverse an array without creating another array.
// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int temp;
//         int arr[] = {1,2,35,65,7};
//             for(int i = 0, j = arr.length-1 ; i <=j  ; j--,i++){
              
//                 temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp; 
//                 //   System.out.println(arr[i]);
               
//             }
//           System.out.println(Arrays.toString(arr));
//             }    

//         }


// Swap the first and last elements.
//bruteforce
// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int temp;
//         int arr[] = {1,2,35,65,7};
//             for(int i = 0, j = arr.length-1 ; i==0  ; j--,i++){
              
//                 temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp; 
               
//             }
//           System.out.println(Arrays.toString(arr));
//             }    

//         }


// Swap the first and last elements.
// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int temp;
//         int arr[] = {1,2,35,65,7};
//             temp = arr[0];
//             arr[0] = arr[arr.length-1];
//             arr[arr.length-1] = temp;
//               System.out.println(Arrays.toString(arr));
//     }

//         }

//Move all zeros to the end.
// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int temp;
//         int arr[] = {1,2,3,4};
//         for(int i = 0 , j = arr.length-1; i<=j ;){
//             if(arr[i]==0 && arr[j] != 0){
//             temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             j--;
//             }
//             else if(arr[i]==0 && arr[j]==0){
//                 j--;
//             }
//             else if(arr[j]==0){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//              System.out.println(Arrays.toString(arr));
           
//         }
//         //  System.out.println(Arrays.toString(arr));
        
           
//     }

//         }


//Correct writer-pointer approach 
// import java.util.Arrays; 
// class arr{
//     public static void main(String[] args){
       
//         int arr[] = {0, 0, 1, 2, 3};
//         int j = 0;
//         for(int i = 0 ; i<arr.length; i++){
//             if(arr[i]!=0){
//                 arr[j] = arr[i];
//                 j++;
//             }
//             System.out.println(Arrays.toString(arr));
//         }

//         while(j < arr.length){
//             arr[j] = 0;
//             j++;
//         }System.out.println(Arrays.toString(arr));
//     }
//         }

// Find the number that appears most frequently.
// class arr{
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,4};
//     int max_count = 0;
//     int most_freq = 0;
//     for(int i = 0 ; i<arr.length ; i++){
//         int num = arr[i];
//         int count = 0;
//         for(int j = 0 ; j <arr.length ; j++){
//             if(num == arr[j]){
//                 count++;
//             }
//         }
//         if(count > max_count){
//             max_count = count;
//             most_freq = arr[i];
//         }
        
//     }
//     System.out.println(most_freq);
//     }
// }

//Missing Number.
// class arr{
//     public static void main(String[] args){
//         int arr[] = {3,0,1,2,5};
//         int sum = 0;
//         int exp = 0;
//     for(int i = 0 ; i< arr.length ; i++){
//         sum = sum + arr[i];
//     }
//     // System.out.println(sum);

//     for(int i = 0 ; i <= arr.length; i++){
//         exp = exp + i;
//     }
//     System.out.println(exp);
    
//   //  System.out.println(exp + arr.length);

//     int missing_no = exp - sum;
//     System.out.println(missing_no);
//     }
// }

//alternative to find the epecetd result
// int expected_result = arr.length * (arr.length + 1) / 2;



//Duplicate Number
// class arr{
//     public static void main(String[] args){
//         int arr[] = {1, 3, 3,4, 2, 2};
 
//     // int d = 0;
//     for(int i = 0 ; i<arr.length ; i++){
//         int num = arr[i];
       
      
//         int count = 0;

//         for(int j = 0 ; j <arr.length ; j++){
//             if(num == arr[j]){
//                 count++;
//             }
//         }
//         if(count > 1){
           
//             int duplicate = arr[i];
//            System.out.println(duplicate);
//            break;
//         } 
        
//     } 
//     }
// }


// Next: Two Sum 
// Interview Question

// Given an array of integers and a target value, find two numbers whose sum equals the target.

// class arr{
//     public static void main(String[] args){
//         int arr[] = {3,2,4};
//         int target = 6;
//     int a = 0;
//         for(int i = 0 ; i<arr.length ; i++){
//             for(int j = i+1 ; j /++<arr.length ; j++){
//                     if((arr[i]+arr[j])==target){
//                         a = (arr[i]+arr[j]);
//                          System.out.println(arr[i] + " "+arr[j]);
//                          break;
//                     }
//                                 }
//                   if(a==target){
//                     break;
//                   }  
        
//         }
//     }
// }


//move zeros to last
// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int arr[] = {1, 0, 3,4, 2, 2};
 
//     // int d = 0;
//     for(int i = 0 , j = arr.length-1; i< arr.length;i++){
//             if(arr[i] == 0){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j]=temp;
//             j--;
//         }
    
    
//     }
//     System.out.println(Arrays.toString(arr));
//     }
// }

// Find the majority element.

// Given an array, find the element that appears more than n/2 times.
// Example:
// int[] arr = {2, 2, 1, 1, 1, 2, 2};
// Expected output:

// 2

// Try coding it yourself first. No hints yet.6

// import java.util.Arrays;
// class arr{
//     public static void main(String[] args){
//         int arr[] = {2, 2, 1, 1, 1, 2, 2};
//         int count ;
//         int n = arr.length;
//     // int d = 0;
//     for(int i = 0 ; i< arr.length;i++){
//         count = 0;
//          for(int j = 0; j <arr.length ; j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
            
//             }
//             if(count > (n/2)){
//                 System.out.println(arr[i]);
//                 break;
//             }
//             }

//     }
// }

//Correct ans just add boolean
// import java.util.Arrays;
// class arr {
//     public static void main(String[] args) {

//         int[] arr1 = {1, 2, 2, 3, 4};
//         int[] arr2 = {2, 2, 4, 6};

//         for (int i = 0; i < arr1.length; i++) {

//             boolean alreadySeen = false;

//             // Check if arr1[i] appeared earlier
//             for (int k = 0; k < i; k++) {
//                 if (arr1[k] == arr1[i]) {
//                     alreadySeen = true;
//                     break;
//                 }
//             }

//             if (alreadySeen)
//                 continue;

//             // Check if element exists in arr2
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     System.out.println(arr1[i]);
//                     break;
//                 }
//             }
//         }
//     }
// }


// Rotate an array to the right by k positions.
// Given:
// int[] arr = {1, 2, 3, 4, 5};
// int k = 2;
// Expected output:
// [4, 5, 1, 2, 3]

// import java.util.Arrays;
// class arr {
//     public static void main(String[] args) {

//         int[] arr1 = {1, 2, 3, 4, 5};
//         int k = 2;

//         for(int i = k+ 2)
        

//     }
// }


// Striver — Left Rotate Array by D Places
// Question:
// Given an array and an integer D, rotate the array to the left by D places.
// Example:
// Input:  arr = [1, 2, 3, 4, 5]
//         D = 2
// Output: [3, 4, 5, 1, 2]
// Your task
// Write the Java code to solve this.

// import java.util.Arrays;

// class arr{
//     public static void main(String[] args) {

//          int[] arr = {1, 2, 3, 4, 5};
//         int D = 2;

//         for(int i = 0 ; i<D ; i++){
//              int position = arr[0];
//             for(int j = 0 ; j< arr.length-1 ; j++){
//             arr[j] = arr[j+1];
//             }
//         arr[arr.length-1] = position;
//         System.out.println(Arrays.toString(arr));
// }
//  System.out.println(Arrays.toString(arr));
//     }
// }


// Question:
// Given a binary array containing only 0 and 1, find the maximum number of consecutive 1s.
// Example:
// Input:  [1, 1, 0, 1, 1, 1]
// Output: 3
// Another:
// Input:  [1, 0, 1, 1, 0, 1]
// Output: 2
// class arr{
//     public static void main(String[] args) {

//          int[] arr = {1, 1,1,0,1,1,1,1};
//           int count = 0;
//           int max_count = 0;
//          for(int i = 0 ; i < arr.length ; i++){ 
//                 if(arr[i] == 1){
//                     count++;
//                     if(count>max_count){
//                         max_count = count;
//                     }
//                 }
//                 else{
//                     count = 0;
//                 }
//                          }
//                          System.out.println(max_count);
//         }    
//     }

