class LCM{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 12;
		
		int n = a > b ? a : b;
	
		int step = n;
		
		while(true)
		{
			if(n%a == 0 && n%b == 0)
				break;
			n = n + step;
		}
		System.out.println("lcm: " + n);
		}
	}
	