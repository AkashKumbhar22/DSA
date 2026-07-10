public class DirectRecursion{
	public static void main(String[] args)
	{
		}
		
	public static int fact(int num)
	{
		if(num == 1) // BASE CASE
			{
			return 1;
			}
		return num * fact(num-1); //RECURSIVE CASE
		}
	
	public static int sum(int num){
	 if(num == 0)
	 {
		return 0;
	}
	return num+sum(num-1);
	}
	
	public static void 
	 
			