import java.util.Scanner;
class PrimeRange{
public static int PRange(int n){
	int count = 0;
	for(int i = 1 ; i < n/2; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		return count;
		}
		
	public static void main(String[] args)
	{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Give the start range : ");
	int start = sc.nextInt();
	System.out.println("Give the end range : ");
	int end = sc.nextInt();
		
		for(int i = start ; i<=end ; i++)
		{
		if(PRange(i) == 1)
			System.out.println(i);
		//else
		//	System.out.println("It is not a prime number");
		}
	}
}
	