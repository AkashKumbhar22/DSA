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