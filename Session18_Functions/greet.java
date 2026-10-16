// takes an array

// returns the sum of all elements
 import java.util.Scanner;

public class greet {
    int greet(int arr[], int n){
        int sum = 0;
      for(int i =0 ;i < n ; i++){
        sum = sum + arr[i];
      }
    return sum;

    }
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
int [] arr = new int[n];

for(int i = 0; i < n ; i++){
arr[i] =sc.nextInt();
}
        greet obj = new greet();
        int result =  obj.greet(arr,n);
      System.out.println(result);
    }
}
