import java.util.Scanner;

public class Prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        boolean is_prime = false;

        for(int i = 2;i<n;i++){
            if(n%i!=0){
                is_prime = true;
                System.out.println("It is a prime number");
                break;
            }
        }
        
    } 
}   
