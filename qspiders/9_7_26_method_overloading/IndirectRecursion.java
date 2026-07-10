class IndirectRecursion{
	public static void main(String[] args)
	{
		first(7);
		}
		
		public static void first(int n)
		{
			if(n==0) //BASE CODE
			{
				System.out.println("Number is even");
				return;
			}
			
			next(n-1); //RECURSIVE CASE 
		}
		
		public static void next(int n)
		{
			if(n==0) //BASE CASE
			{
				System.out.println("Number is Odd");
				return;
				}
				first(n-1);
				}
			}
			
			