/*
import java.util.Scanner;
class Reverse{
	public static boolean rev(int n)
		{
			int temp = n;
			int rev = 0;
			while(n>0)
			{
				int digit = n%10;
				
				rev = rev * 10 + digit;
				
				n = n / 10;
				}
			
			return temp == rev;
			}
			
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed: ");
		int n = sc.nextInt();
		
		//rev(int n);
		if(rev(int n)
		{
			System.out.println("The reversed number is : " + rev(int n);
		}
		else
		{
			System.out.println("Error this number cant be reversed");
	}
}
} 
*/

public static void main(String[] args)
{
	int n = 391;
	int temp = n;
	int rev = 0;
	while(n>0)
	{
		int digit = n % 10;
		rev = rev * 10 + digit ;
		n = n/10;
	}
	
	
	System.out.println("The reversed number is "  + rev);
	
}