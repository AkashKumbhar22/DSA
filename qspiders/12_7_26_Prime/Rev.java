//
import java.util.Scanner;
class Rev{
public static int Revr(int n)
{
	int rev = 0;
	while(n>0)
	{	
		int digit = n % 10;
		rev = rev * 10 + digit;
		n = n / 10;
		}
	return rev;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting range: ");
		int start = sc.nextInt();
		
		System.out.print("Enter the end range ");
		int end = sc.nextInt();
		
		for(int i = start ; i <= end ; i++){
		System.out.println(Revr(i));
		}
		}
		}
		
	