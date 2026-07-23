class spy{
	public static void main(String[] args)
	{
		int n = 135;
		int temp = n;
		int sum = 0;
		int prod = 1;
		
		while(n>0)
		{
		int digit = n %10;
		sum = sum + digit;
		prod = prod * digit;
		n = n / 10;	
	}
		if(sum == prod)
			System.out.println(temp + " is a spy number");
		else
			System.out.println(temp + " is not a spy number");
	}
}