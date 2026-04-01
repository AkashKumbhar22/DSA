
// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//                 smallest = arr[i];
//             }   
//     }  
//      System.out.print("The smallest element in array is: "+smallest);
//         }
//     }  

    


// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find largest element in array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }

//       // int largest = arr[0];
//       int largest = Integer.MIN_VALUE;
//       int largest2 = Integer.MIN_VALUE ;
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }  
//     }  

//        for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest2 && arr[i] != largest){
//                 largest2 = arr[i];
//             }  
//     }  

//     System.out.println("The largest element in array is: "+largest);
//     System.out.println("The second-largest element in array is: "+largest2);
//         }
//     }  


// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }
        
      
//         for(int i=n-1;i>=0;i--){
//             System.out.print(arr[i]);
//         }
//         }
//     }  




//Find the samlelst and second smallest number in the array
// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;
//        int sec_smallest =Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//                 smallest = arr[i];
//             }   
//     }  
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<sec_smallest && arr[i] != smallest){
//                 sec_smallest = arr[i];
//         }
//      System.out.print("The smallest element in array is: "+smallest);
//     System.out.println("The second-smallest element is: "+sec_smallest);}

//         }
//     }  

    

//Find the largest number & second -largest number
// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find largest element in array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }

//       // int largest = arr[0];
//       int largest = Integer.MIN_VALUE;
//       int largest2 = Integer.MIN_VALUE ;
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }  
//     }  

//        for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest2 && arr[i] != largest){
//                 largest2 = arr[i];
//             }  
//     }  

//     System.out.println("The largest element in array is: "+largest);
//     System.out.println("The second-largest element in array is: "+largest2);
//         }
//     }  

//reverse the array
import java.util.Scanner;
public class arr_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter the element at position "+(i+1)+ ": ");
            arr[i]=sc.nextInt();
        }

    //    System.out.println("The first element before reversing " + arr[0]);
        for(int i=0;i<n/2;i++){
            //arr[n-1]=arr[0];
            int temp = arr[i];
            arr[i] = arr[n-(i+1)];
            arr[n-(i+1)] = temp;
          //  arr[n-1]=arr[0];

            System.out.print(temp+" ");
        }
       /// System.out.println("The first element after reversing " + arr[0]);
      
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        //}
        }
    }  



//doing smallest and second smallest number in one loop

// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;
//        int sec_smallest =Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//              //   smallest = sec_smallest;
//              sec_smallest = smallest;
//                 smallest = arr[i];
//               //  sec_smallest = smallest;
//             }   
//             else if(arr[i]<sec_smallest && arr[i]!=smallest ){
//                 sec_smallest = arr[i];
//             }
//     }  

//      System.out.println("The smallest element in array is: "+smallest);
//     System.out.println("The second-smallest element is: "+sec_smallest);
// }

//         }
    
   //     geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1



// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//                 smallest = arr[i];
//             }   
//     }  
//      System.out.print("The smallest element in array is: "+smallest);
//         }
//     }  

    


// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find largest element in array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }

//       // int largest = arr[0];
//       int largest = Integer.MIN_VALUE;
//       int largest2 = Integer.MIN_VALUE ;
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }  
//     }  

//        for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest2 && arr[i] != largest){
//                 largest2 = arr[i];
//             }  
//     }  

//     System.out.println("The largest element in array is: "+largest);
//     System.out.println("The second-largest element in array is: "+largest2);
//         }
//     }  


// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }
        
      
//         for(int i=n-1;i>=0;i--){
//             System.out.print(arr[i]);
//         }
//         }
//     }  




//Find the samlelst and second smallest number in the array
// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;
//        int sec_smallest =Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//                 smallest = arr[i];
//             }   
//     }  
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<sec_smallest && arr[i] != smallest){
//                 sec_smallest = arr[i];
//         }
//      System.out.print("The smallest element in array is: "+smallest);
//     System.out.println("The second-smallest element is: "+sec_smallest);}

//         }
//     }  

    

//Find the largest number & second -largest number
// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find largest element in array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }

//       // int largest = arr[0];
//       int largest = Integer.MIN_VALUE;
//       int largest2 = Integer.MIN_VALUE ;
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }  
//     }  

//        for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>largest2 && arr[i] != largest){
//                 largest2 = arr[i];
//             }  
//     }  

//     System.out.println("The largest element in array is: "+largest);
//     System.out.println("The second-largest element in array is: "+largest2);
//         }
//     }  

//reverse the array
import java.util.Scanner;
public class arr_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter the element at position "+(i+1)+ ": ");
            arr[i]=sc.nextInt();
        }

    //    System.out.println("The first element before reversing " + arr[0]);
        for(int i=0;i<n/2;i++){
            //arr[n-1]=arr[0];
            int temp = arr[i];
            arr[i] = arr[n-(i+1)];
            arr[n-(i+1)] = temp;
          //  arr[n-1]=arr[0];

            System.out.print(temp+" ");
        }
       /// System.out.println("The first element after reversing " + arr[0]);
      
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        //}
        }
    }  



//doing smallest and second smallest number in one loop

// import java.util.Scanner;
// public class arr_que {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //Find smallest element in array
//        // take the input size of array
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n]; //declare the variable

//        // Taking the elements of array as input
//         for(int i=0 ; i<n ; i++){
//             System.out.print("Enter the element at position "+(i+1)+ ": ");
//             arr[i]=sc.nextInt();
//         }


//      //   declaring the first element of array as smallest
//      //  int smallest = arr[0];    
//        //OR 
//        //Compare with the most largest number(Integer.MAX_VALUE)
//         int smallest = Integer.MAX_VALUE;
//        int sec_smallest =Integer.MAX_VALUE;

//  //   comparing the smallest array with others if smaller found update it
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]<smallest){
//              //   smallest = sec_smallest;
//              sec_smallest = smallest;
//                 smallest = arr[i];
//               //  sec_smallest = smallest;
//             }   
//             else if(arr[i]<sec_smallest && arr[i]!=smallest ){
//                 sec_smallest = arr[i];
//             }
//     }  

//      System.out.println("The smallest element in array is: "+smallest);
//     System.out.println("The second-smallest element is: "+sec_smallest);
// }

//         }
    
   //     geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
