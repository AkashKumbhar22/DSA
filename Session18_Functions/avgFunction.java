//take a funtion name as average which take your six subject marks in int the function shoulld calculate the avg percentage
import java.util.Scanner;

public class avgFunction{

    static void avg(int total){
        double avg = total/6;
        System.out.println("The avgerage is: "+ avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
            int marks[] = new int[6];
            for(int i=0;i<6;i++){
                    System.out.print("Enter marks : ");
                    marks[i] = sc.nextInt();
            }



            int total = 0;
            for(int i = 0 ; i < 6 ; i++){
                total = total + marks[i];
            }
            avg(total);
    }
}
//Logic is correct



//Improvement suggest by chatgpt 
// import java.util.Scanner;

// public class AvgFunction {

//     // Function named average that takes 6 subject marks
//     static void average(int m1, int m2, int m3, int m4, int m5, int m6) {
//         int total = m1 + m2 + m3 + m4 + m5 + m6;
//         double avg = total / 6.0;   // use 6.0 to get decimal value
//         System.out.println("The average percentage is: " + avg + "%");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter marks of subject 1: ");
//         int m1 = sc.nextInt();

//         System.out.print("Enter marks of subject 2: ");
//         int m2 = sc.nextInt();

//         System.out.print("Enter marks of subject 3: ");
//         int m3 = sc.nextInt();

//         System.out.print("Enter marks of subject 4: ");
//         int m4 = sc.nextInt();

//         System.out.print("Enter marks of subject 5: ");
//         int m5 = sc.nextInt();

//         System.out.print("Enter marks of subject 6: ");
//         int m6 = sc.nextInt();

//         average(m1, m2, m3, m4, m5, m6);
//     }
// }
