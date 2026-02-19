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
