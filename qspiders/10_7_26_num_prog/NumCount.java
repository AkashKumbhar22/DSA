import java.util.Scanner;
class NumCount{
	public static int Count(int n)
	{
		int count = 0;
		while(n != 0)
		{
			count ++ ;
			n = n / 10;        //  '/' = Slash Operator (remove last digit)
			int m = n % 10 ; 	// '%' = Modulus Opearator (fetch last digit)
			}
		return count;
		}
		
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The number of digits in " + "are:" + Count(n));
		}
		}