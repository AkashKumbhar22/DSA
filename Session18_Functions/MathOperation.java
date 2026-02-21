import java.util.Scanner;
public class MathOperation {
    int square(int n){
        return n*n;
    }
    int cube(int n){
        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MathOperation obj = new MathOperation();
        int result =  obj.square(n) ; 
        int result1 = obj.cube(n);
        
        System.out.println(result);
        System.out.println(result1);

    }
}
