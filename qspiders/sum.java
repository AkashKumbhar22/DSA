import java.util.Scanner;

class Sum{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int ans = natural_no(n);
	System.out.println("The ans is " + ans); 
	}
	
	public static int natural_no(int n)
	{
		
		return (n*(n+1)/2);
		}
}