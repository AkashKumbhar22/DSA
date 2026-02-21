import java.util.Scanner;
public class NumberUtility {
    boolean isPositive(int n){
        return n > 0;
    }
    boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    NumberUtility obj = new NumberUtility();

    boolean result = obj.isPositive(n);
    
    if(!result){
        System.out.println("Print Invalid");
    }

    else if(obj.isEven(n)){
        System.out.println("Positive Even Number");
    }
    else{
        System.out.println("Positive Odd Number");
    }
    }
    
}
