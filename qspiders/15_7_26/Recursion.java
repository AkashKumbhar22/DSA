class Recursion{
	public static void Rec(int n)
	{
		System.out.println(n);
		if(n == 69)
		{
			return ;
		}
		Rec(n+1);
		return ;
		
	}
	
	public static void main(String[] args){
		int n = 23;
		Rec(n);
	}
}
	
	