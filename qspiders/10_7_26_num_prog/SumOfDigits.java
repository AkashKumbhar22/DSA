//The sum of all digits in a number
class SumOfDigits
{
	public static int Sum(int n)
	{
		int sum = 0;
		while(n>0){
			int digit  = n % 10;
			sum = sum + digit;
			n = n/10;
			}
		return sum;
		}
	public static void main(String [] args)
	{
		System.out.println("The sum of number is :"+ Sum(28830));
		}
}