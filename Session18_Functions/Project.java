import java.util.Scanner;
public class Project{
    static void avg(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
       float avg = (float) sum / arr.length;
       System.out.println(avg);
       int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg ){
                count++;
            }
        }
        System.out.println("The days above temp is " + count);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many days temp: ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the Day " + (i+1) +"'s highest temp");
             arr[i]=sc.nextInt();
        }
        avg(arr);
    }
}