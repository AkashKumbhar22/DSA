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
			
			System.out.print("Enter your  Phone mber: ");
			long large = sc.nextLong();
			System.out.println(a + " Your age is: " + age + "& you are in: " + div + " Division" + "Your phone number is: " + large );
			
			System.out.print("Enter your CGPA: ");
			double cgpa = sc.nextDouble();
			System.out.println(a + " Your age is: " + age + "& you are in: " + div + " Division" + + "Your phone number is: " + large + " Your CGPA is: " + cgpa );
			
			System.out.print("Are you disabled: " );
			boolean disability = sc.nextBoolean();
			System.out.println(a + " Your age is: " + age + "& you are in: " + div + " Division"  + "Your phone number is: " + large + " Your CGPA is: " + cgpa +"You are : " +  disability);

			}
			}