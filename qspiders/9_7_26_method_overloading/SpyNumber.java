//SPY Number
//A number whose sum of digits is equal to the product of digits is called as a spy number
class SpyNumber{
	public static int SumofDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			int digit = n% 10;
			sum = sum + digit;
			n = n /10;
		}
		return sum;
	}
	
	public static int Product(int n){
	int prod   = 1;
		while(n>0){
			int digit  = n % 10;
			prod = prod * digit;
			n = n/10;
			}
		return prod;
		}
		

		
			
	public static String isSpy(int n)
	{
		if(SumofDigits(int n) == Product(int n)) 
			return "It is a Spy Number";
		
		return "It is not a Spy Number";
}

	public static void main(String[] args)
	{	
		System.out.println(isSpy(99));
}
}