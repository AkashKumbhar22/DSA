class FactorialNumbers{
	public static int fact(int n)
	{
	int product = 1;
	int i = 1;
	while(i <= n)
	{
		product = product * i;
		i++;
		}
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println(fact(n));
		}
		}