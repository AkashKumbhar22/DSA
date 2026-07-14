//A perfect number is a positive integer equal to the sum of its proper positive divisors, excluding the number itself

class Perfect
{
	public static boolean Perfect(int n)
		{
			int temp = n;
			int sum = 0;
			for(int i = 1 ; i <= n/2 ; i++)
			{
				if(n % i == 0)
					sum = sum + i;
			}
			
			return (temp == sum);
			}
		
		public static void main(String[] args)
		{
				if(Perfect(28))
				{
					System.out.println("It is a perfect number:");
				}
				else
					System.out.println("it is not a Perfect Number");
}
}			
