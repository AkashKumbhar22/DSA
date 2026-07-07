import java.util.Scanner;
class number_triangle{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int n = sc.nextInt();
	
	
	for(int i = 1 ; i <= n ; i++)
	{
		for(int j = 1 ; j <= n-i; j++)
		{
			System.out.print(" ");
		}
		for(int stars = i ; stars >= 1 ;stars--)
		{
			System.out.print(stars + " ");
		}
		for(int z = 2 ; z <= i ; z++)
		{
			System.out.print(z+" ");
		}
		
		System.out.println();
	}
}
}
	
	