class Perfect
{
	public static boolean Perfect(int num)
		{
			int temp = num;
			int sum = 0;
			while(num>0)
			{
				int digit = num % 10;
				sum = sum + digit;
				int n = num/10;
			}
			return temp == sum;
			}
		
		public static void main(String[] args)
		{
			if(Perfect(33))
				{
				System.out.println("it is a Perfect Number");
				}
			else{
		    	System.out.println("it is Not a Perfect Number");
			}
}
}			
