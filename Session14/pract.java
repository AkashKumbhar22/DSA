// import java.util.Scanner;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);


//         System.out.print("Enter the size of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter the size of columns: ");
//         int columns = sc.nextInt();

        
//         int marks[][] = new int[rows][columns];

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print("Enter the value of rows&columns"+"["+i+"]"+"["+j+"]: ");
//                 marks[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }
//          for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print( marks[i][j]+" ");
//             }
//             System.out.println();
//          }
        
//     }
// }



import java.util.Scanner;
public class pract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

int n = 1000;
int sum = 0;
        for(int i=1;i<n;i++){
                if(i%3==0 || i%5==0){
                    sum = sum +i;
                }
        }
        System.out.print(sum);
    }
}


int i=1;
int sum=0;
while(i<=20):
sum+=i;
print(sum)