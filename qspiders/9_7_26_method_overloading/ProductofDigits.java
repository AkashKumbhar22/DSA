//The product digits in a number
class ProductofDigits
{
	public static int Product(int n)
	{
		int prod   = 1;
		while(n>0){
			int digit  = n % 10;
			prod = prod * digit;
			n = n/10;
			}
		return prod;
		}
	public static void main(String [] args)
	{
		System.out.println("The product of digits in number is " + Product(1098));
		}
}