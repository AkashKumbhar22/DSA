//Print main and secondary diagonal


// import java.util.Scanner;
// public class prac {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no. of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter the no. of columns: ");
//         int columns = sc.nextInt();

//         int marks[][] = new int[rows][columns];

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print("Enter the ["+i+"]"+"["+j+"]"+":");
//                 marks[i][j] = sc.nextInt();
//             }
//                   }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                System.out.print(marks[i][j] +" ");
//             }
//             System.out.println();
//         }


//         System.out.print("I am printing all diagonal elements: ");
//                 for(int i=0;i<rows;i++){
//                     System.out.print(marks[i][i]+" ");
//     } 
//     System.out.println("  ");

//      for(int i=0;i<rows;i++){
//             for(int j=columns-1;j>=0;j--){
//                 if(i+j==rows-1){
//                System.out.print(marks[i][j] +" ");
//             }
//         }
//         }
// }
// }





//Interchange of diagonals
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the no. of columns: ");
        int columns = sc.nextInt();

        int marks[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the ["+i+"]"+"["+j+"]"+":");
                marks[i][j] = sc.nextInt();
            }
                  }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
               System.out.print(marks[i][j] +" ");
            }
            System.out.println();
        }


        System.out.print("I am printing all diagonal elements: ");
                for(int i=0;i<rows;i++){
                    System.out.print(marks[i][i]+" ");
    } 
    System.out.println("  ");

    int temp=0;
     for(int i=0;i<rows;i++){
            for(int j=columns-1;j>=0;j--){
                if(i+j==rows-1){
                  //  for(int x=0;x<rows;x++){
                     temp =marks[i][j];
                     marks[i][j] = marks[i][i];
                     marks[i][i] = temp;

              System.out.print(marks[i][j] +" ");
           // }
        }
                     System.out.print(marks[i][i] +" ");

        }
        System.out.println();
}
    }

}