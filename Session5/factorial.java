/*Factorial Sum: Calculate the sum of the factorials for numbers from 1 up to N=5 (i.e., 1! + 2! + 3! + 4! + 5!).
 */
public class factorial {
    public static void main(String[]args){
        int N=5;
        int factorial = 0;
        for(int i=1;i<=N;i++){
            factorial = i * (i+1);
        }
    }
}
