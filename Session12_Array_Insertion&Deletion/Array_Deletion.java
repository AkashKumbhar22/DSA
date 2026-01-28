import java.util.Arrays;
import java.util.Scanner;
class Array_Deletion{
        //Function to print the array
        public static void Display(int n,int actual_values[]){
            for(int i=0;i<n;i++){
            System.out.println("The element at position:" + i +"is:" + " " + actual_values[i] );
            }
        } 

        //Function for delete
        // public static void delete{
        //     arr[n-1]
        // };

    public static void main(String args[]){
        int arr[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n(no. of actual elements): ");
        int n = sc.nextInt();
        int actual_values [] = new int[n];

       // int actual_value [] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elments at position :" + i +": " );
            actual_values[i] = sc.nextInt();
            }

     Display(n,actual_values);



     //Deleting last element in array
     //We have used the if conition what if the array is lement we cannot delete anything
     if(n>=1){
    //  for(int i = 0;i<n-1;i++){
    //     System.out.println(actual_values[i]);
    //  }
     //OR
     System.out.println("Deleting the last element in array: ");
     actual_values[n-1]=0;
     n--;

    Display(n,actual_values);
     
    }
}
}