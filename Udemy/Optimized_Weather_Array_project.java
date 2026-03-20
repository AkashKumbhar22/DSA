    import java.util.Scanner;

public class Optimized_Weather_Array_project {


    public static void calculateStats(int[] arr) {
        int sum = 0;

        // First pass → sum
        for (int temp : arr) {
            sum += temp;
        }

        double avg = (double) sum / arr.length;

        int count = 0;

        // Second pass → count above average
        for (int temp : arr) {
            if (temp > avg) {
                count++;
            }
        }

        System.out.println("\nAverage Temperature: " + avg);
        System.out.println("Days Above Average: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + " temperature: ");
            arr[i] = sc.nextInt();
        }

        calculateStats(arr);

        sc.close();
    }
}

