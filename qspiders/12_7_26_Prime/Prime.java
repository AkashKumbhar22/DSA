//Prime number : If it is completey divisible by only two numbers i.e. by 1 and the number itself is called as Prime Number.
class Prime
{
	public static void main(String[] args)
	{
		int n = 13;
		int count = 0;
		for(int i = 1 ; i < = n ; i++)
		{
			if(n%2==0)
			{
				count++;
			}
		}
		if(count == 2)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is Nota Prime Number");
			}
			}
			