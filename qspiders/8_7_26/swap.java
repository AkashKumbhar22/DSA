class swap
{
	public static String swap(int a , int b)
	{
	a = a+b;
	b = a-b;
	a = a-b;
	
	return "a: "+ a + "b: " + b;
	}
	
	public static void main(String[] args)
	{
		//int a = 69;
	//	int b = 96;
		System.out.println(swap(9,6));
		}
		}