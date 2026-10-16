import java.util.Scanner;
public class Weather_Array_project {
        public static void average(int arr[]){
            int sum = 0;
            for(int i : arr)
                sum += i;

            // for(int i = 0; i < arr.length ; i++){
            //     sum = sum + arr[i];
            // }

            int avg = sum / arr.length;

                // for(int i = 0; i < arr.length+1 ; i++){
                //     if(arr[i] > avg){
                //         count++;
                //     }
                //     }

               int count = 0;

            for(int i : arr){
                if(i > avg){
                    count++;
                }
            }
            System.out.println("The average temp is: " + avg );
            System.out.println("The days above average temp is: "+ count);
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int arr [] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the temperature of Day "+ (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        average(arr);

    }
}
