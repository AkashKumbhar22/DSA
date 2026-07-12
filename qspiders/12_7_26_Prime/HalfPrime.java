class HalfPrime
{
	public static int Prime(int n)
	{
		int count = 0;
		for(int i = 1 ; i <= n/2 ; i++)
		{
			if(n%i == 0)
			{
				count++;
				}
		}
		return count;`
		}
	
	public static void main(String[] args)
	{
		if(Prime(80) >= 1 )
		{
			System.out.println("It is a Prime Number");
			}
		else 
			System.out.println("It is Not a Prime Number");
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
	
	if(count == 2)
	
	
	
*/