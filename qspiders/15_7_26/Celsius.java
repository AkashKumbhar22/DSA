import java.util.Scanner;
class Celsius{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Celsius: ");
		double c = sc.nextInt();
		
		double far = ((1.8 * c) + 32);
		System.out.println("The farhenit value is: " + far);
	}
}