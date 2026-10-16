/*Sum of Squares: Calculate and print the sum of the squares of the first N=15 natural numbers.
 */
public class sm_of_squares {
    public static void main(String[]args){
        int N = 15;
        int sum = 0;
        for(int i=0;i<=N;i++){
            sum = sum + (i*i);
          //  System.out.println(sum);
        }
        System.out.println("The sum of squares is: "+sum);
    }
    }
