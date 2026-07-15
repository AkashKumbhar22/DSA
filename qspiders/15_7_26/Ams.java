import java.util.Scanner;
class Ams{
	public static int Expon(int base , int power)
	{
		int exp = 1;
		for(int i = 1 ; i<= power; i++)
		{
			exp = exp  * base;
		}
		return exp;
	}
	
	public static int count(int n)
	{	
		int count = 0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static boolean amstrong(int n,int count)
	{ 
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int digit = n % 10;
			sum = sum + Expon(digit,count);
			n = n/10;
		}
		return sum == temp;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		//System.out.println(Expon(2,3));
		//System.out.println(count(123));
		//System.out.println)amstrong(123));
		
	//	int n = 153;
		if(amstrong(n, count(n)))
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}
		
	}
}
	