class Power{
	public static int Index(int base , int power)
	{
		int p = 1;
		for(int i = 1 ; i <= power ; i++){
			p = p * base;
			}
		return p;
			}
	public static void main (String[] args)
	{
		System.out.println(Index(2,3));
	}
	}