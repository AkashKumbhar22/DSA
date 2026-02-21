import java.util.Scanner;
public class NumberAnalyzer{
    boolean isEven(int n){
        return n % 2 == 0;
    }
    int squ(int n){
        return n * n ;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    NumberAnalyzer obj = new NumberAnalyzer();
    
    boolean result = obj.isEven(n);

    if(result == true){
        int result2 = obj.squ(n);
        System.out.println("The square of n is: "+result2); 
    }
    else{
        System.out.println("number is Odd");
    }
    }
    }
