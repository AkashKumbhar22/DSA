import java.util.Scanner;

public class GradeAnalyzer {
    char getGrade(int n){
     //   char grade;
       if(n>=90){
            return 'A';
       }
       else if(n>=75){
 return 'B';
       }
       else if(n>=50){
return 'C';}
        else{
return 'F';        }
        //return grade;
    }
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            GradeAnalyzer obj = new GradeAnalyzer();
            System.out.println("Grade = " + obj.getGrade(n));
        }   
    }

