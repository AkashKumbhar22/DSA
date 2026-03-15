import java.util.Scanner;
public class Middle {
    static void element(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if( i > 0 && i < arr.length-1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n(size of array): ");
        int n = sc.nextInt();
        int arr [];
        arr = new int[n];

        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        element(arr);
    }
}
