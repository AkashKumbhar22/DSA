class Add{
public static int addition(int n)
{
		if(n== 1)
			return 1;
		n--;
		return addition(n) + (n-1) ;
}
	public static void main(String[] args)
	{
			System.out.println(addition(6));
	}
}