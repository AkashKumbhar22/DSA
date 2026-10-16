class T_Prime{
	public static boolean prime(int n)
		{
			int count = 0;
			for(int i = 1 ; i <=n/2 ; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
			}
			if(count == 1){
				return true;
			}
			else{
				return false;
			}
		}
		
		public static int reverse(int n){	
		int rev = 0;
		while(n>0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n/10;
			}
		return rev;
		}
		
		public static void main(String[] args){
				//System.out.println(reverse(123));
			//	Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the value of n: ");
		int n = 13;
		int rev = reverse(n);
		if(prime(n) && prime(rev)){
				System.out.println("It is a twisted prime number");
				}
		else{
					System.out.print("It is not a twisted prime number");
				}
}
}		