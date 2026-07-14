class Prime
{
	public static void main(String[] args)
	{
		int n = 13;
		int count = 0;
		for(int i = 1 ; i<=n/2 ; i++)
		{
			if(n%2==0)
			{
				count++;
			}
		}
		if(count == 1)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is Not a Prime Number");
			}
			}
			
			
			/*
	num = 100;
	2 , 4 , 5, 10 ,20,
	prime number = 13 
	1 ,13
	13 % 1 == 0
	13% 13 == 0
	
	71
	1 % 
	2 7
	
	int count = 0;
	int n = 31;
	for(int i = 1; i <= 31; i++)
	{
		if(31 % 3 == 0)
		{ 
		count ++;
		}
	}
	
	if(count == 1)
	
	10 =1  ,2 ,5 ,10
	15 = 1 , 3, 5, 
	22 = 1 , 2 , 11 , 
	
	
	
	
	
	1 2 3 4 5 
	
*/