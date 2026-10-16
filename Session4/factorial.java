/*Factorial Sum: Calculate the sum of the factorials for numbers from 1 up to N=5 (i.e., 1! + 2! + 3! + 4! + 5!).
 */
package Session4;
public class factorial{
    public static void main(String[]args){
        int factorial = 1;
        int sum = 0;
        for(int i=0;i<=5;i++){
            factorial = factorial *i;
            sum = sum+factorial;
        }
        System.out.println(sum);
    }
}
