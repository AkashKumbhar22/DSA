// package Two_Pointer;
// import java.util.Scanner;


// public class two_pointer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int arr[] = {1,2,3,4,5};

//         int target = 10;
//         int left = 0;
//         int right = arr.length-1;
//         boolean found = false;

//         while(left<right){
//             if(arr[left]+arr[right]==target){
//                 System.out.println("The index of sum of target is : "+ left +","+right);
//                 found = true;
//                 break;
//             }
//             else if(arr[left]+arr[right]>target){
//                 right--;
//             }
//              else if(arr[left]+arr[right]<target){
//                 left++;
//             }
           
//         }
//          if(!found){
//                 System.out.println("Target not found");
//             }
//     }
// }


package Two_Pointer;
import java.util.Scanner;


public class two_pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};

        int target = 10;
        int left = 0;
        int right = arr.length-1;
        boolean found = false;

        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("The index of sum of target is : "+ left +","+right);
                found = true;
                break;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
             else if(arr[left]+arr[right]<target){
                left++;
            }
           
        }
         if(!found){
                System.out.println("Target not found");
            }
    }
}

