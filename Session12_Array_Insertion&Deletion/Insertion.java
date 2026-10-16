import java.util.Scanner;
public class Insertion{
    public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    int position = 2;   // the posiyion where the elmennt has to be inserted
    int element = 12;   // The value of the element
    int new_Array[] = new int[arr.length+1];    // Created the new array for the inserted value and its position is 1 more than original array


    //before the insertion the array elemnts are stored in the new_array element
   for(int i=0;i<position;i++){
        new_Array[i] = arr[i];
   }   

   //The elemnt in the array is inserted
   new_Array[position] = element;


   //The remaning value is inserted the index value of orginial array is [i-1]
   for(int i = position+1;i<new_Array.length;i++){
    new_Array[i] = arr[i-1];
   }

   System.out.print("Before Insertion: ");
   for(int i =0;i<arr.length;i++){
    System.out.print(+arr[i]+" ");
   }


   System.out.print("            After Insertion: ");
   for(int i =0;i<new_Array.length;i++){
    System.out.print(new_Array[i]+" ");
   }
    }
}