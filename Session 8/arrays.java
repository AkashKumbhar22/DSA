/* 
import java.util.Scanner;
public class arrays
{
    public static void main(String[]args)
    {
        int []marks = {10,12,223,454,675};

        // for(int index=0;index<marks.length;index++)
        //     {
        //     System.out.print(marks[index]+" ");      
        //   }

          for(int value : marks){
            System.out.println(value + " ");
          }
            }
} 

//Update the array
import java.util.Scanner;
public class arrays
{
    public static void main(String[]args)
    
    {
    //   int[]arr = new int[8];
        int []marks = {10,12,223,454,675};

        marks[0]=2;
       // System.out.println(marks[0]);
       for(int i=0;i<=7;i++){
        int sum =0;
    //    System.out.println(marks[i]);
        sum = sum + marks[i];
     //   System.out.println(sum);
       }
        System.out.println(sum);
            }
}  */


// import java.util.Scanner;
// public class arrays
// {
//     public static void main(String[]args)
    
//     {
//     float[] per = new float[4];
//     per[0]=9.9f;
//     for(int i = 0 ; i<per.length ; i++ )
//     System.out.println(per[i]);

//             }
// } 


// import java.util.Scanner;
// public class arrays
// {
//     public static void main(String[]args)
    
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array :");

//         int size = sc.nextInt();
//      int marks[] = new int[size];

//     System.out.println(marks.length);
//     for(int index = 0 ; index<marks.length ; index++){
//         System.out.println(marks[index]);
//     }
//     }
// }


//Taking the value of array one by one
import java.util.Scanner;
public class arrays
{
    public static void main(String[]args)
    
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :");

        int size = sc.nextInt();
        int in[] = new int[size];
     
        for(int i=0;i<size;i++){
            in[i] = sc.nextInt();
        }

        System.out.println("Enter the number x to be searched: ");
        int x = sc.nextInt();

        for(int i=0;i<size;i++){
            if(x==in[i]){
                System.out.println(i);
            }

        }
    }
}