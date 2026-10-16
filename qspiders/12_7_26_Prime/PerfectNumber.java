class PerfectNumber{
	public static void main (String[] args)
	{
		int n = 22;
		int sum = 0;
		for(int i = 1 ; i <= n/2 ; i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
				}
		}
		if(n == sum)
			System.out.println(n + " Is a perfect Number");
		else
			System.out.println(n + " Is Not a perfect Number");
	}
}
		