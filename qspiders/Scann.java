import java.util.Scanner;
class Scann{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your name ");
			String a = sc.next();
			System.out.println("Hello " + a );
			
			System.out.print("Enter your age");
			int age = sc.nextInt();
			System.out.println(a + " Your age is: " + age);
			
			System.out.print("Enter your Div: ");
			char div = sc.next().charAt(0);
			System.out.println(a + " Your age is: " + age + "& you are in: " + div + " Division");
			}
			}