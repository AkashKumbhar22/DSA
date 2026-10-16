class Perf{
	public static void main(String[] args)
	{
		int p = 0;
		int n = 28;
		int i = 1;
		while(i < n)
		{
			if(n%i==0)
			{
				p = p + i;
			}
		i++;
}
if(p == n)	
	System.out.println(n + " is a perfect number");

if(p !=n)
	System.out.println(n + " is not a perfect number");
	}
}