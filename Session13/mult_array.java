import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
class mult_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the size of array: ");
    //   int n = sc.nextInt();

    //   int sub_array = (n*(n+1))/2;
    //   System.out.println("The size of sub_a
      int arr[] = {5,2,1,3,1};

    //   int start =0;
      
      for(int start=0;start<arr.length;start++){ 
            System.out.println(arr[start]);
            for(int end=start;end<arr.length;end++){
               for(int x = start;x<=end;x++){
                System.out.print(arr[x]+" ");
               }
               System.out.println();
            }            
      }
}
}