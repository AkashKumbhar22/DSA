// 2D array basics

// import java.util.Scanner;
// public class Two_D {

//     public static void main(String[] args) {
        
//     // boolean arr[][] = new boolean[6][5];
    

//     int arr[][] = {
//          {1,2,3},
//         {2,3,4},
//         {3,4,5}
//     };

//     //i represents rows & j represents columns
//     for(int i=0;i<3;i++){
//         for(int j=0;j<3;j++){
//             System.out.print(arr[i][j]+" ");   

//         }
//         System.out.println();
//     }
//     }
// }

//2D diagonal printing
import java.util.Scanner;
public class Two_D {

    public static void main(String[] args) {
        
    // boolean arr[][] = new boolean[6][5];
    

    int arr[][] = {
         {1,2,5},
        {2,3,4},
        {1,4,5}
    };

    //i represents rows & j represents columns
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           // if(i==j)      //In main daiagonal/Right diagonal the no.of rows = no.of columnns
       //     System.out.print("The main diagonal are: "+arr[i][j]+" ");   
    //    }
      //  System.out.println();
      //   for(int j=0;j<3;j++){
          if(i+j == 3-1)  
            System.out.print("The secondary elemnts are are: "+arr[i][j]+" ");   
       // }
    }
     System.out.println();
    }
}
}



