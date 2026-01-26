// public class swap {
//     public static void main(String[]args){
//         int n1 = 0;
//         int n2 = n-1;
//      //   System.out.println("Before Swapping n1:" + n1  +" n2:" + n2);

//         int temp =n1;
//         n1=n2;
//         n2=temp;
//         System.out.println("After Swapping n1:" + n1  +" n2:" + n2)


//     }
// }


//reverse an array by swapping 
import java.util.Arrays;
import java.util.Scanner;
public class swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // take the input size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr [] = new int[n]; //declare the variable

       // Taking the elements of array as input
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter the element at position "+(i+1)+ ": ");
            arr[i]=sc.nextInt();
          //  System.out.println("Before swapping"+arr[i]);
        }
      //System.out.print(Arrays.toString(arr));

      for(int i=0;i<arr.length;i++){
        int t = arr[i];
        arr[i] = arr[n-1];
        arr[n-1] = t;
        System.out.println(arr[i]);
        n--;
    }
    }
}