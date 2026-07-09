class IndirectRecursion{
	public static void main(String[] args)
	{
		first(7);
		}
		
		public static vodi first(int n)
		{
			if(n=0) //BASE CODE
			{
				System.out.println("Number is even");
				return;
			}
			
			next(n-1); //RECURSIVE CASE 
		}
		
		public static vodi next(int n)
		{
			if(num()) //BASE CASE
			{
				System.out.println("Number is Odd");
				return;
				}
				first(n-1);
				}
			}
			
			