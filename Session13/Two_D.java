import java.util.Scanner;
public class Two_D {

    public static void main(String[] args) {
        
    // boolean arr[][] = new boolean[6][5];
    

    int arr[][] = {
         {1,2,3},
        {2,3,4},
        {3,4,5}
    };

    //i represents rows & j represents columns
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i==1 & j==1){
            System.out.println("To print a particular element we use the if condition");
            System.out.print(arr[i][j]+" ");
}
        System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }
    }
}

