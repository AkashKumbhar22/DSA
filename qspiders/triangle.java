import java.util.Scanner;

class triangle{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n:");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++){
			for(int spaces = 0 ; spaces <= n-i; spaces++){
			System.out.print(" ");}
				for(int stars = 0 ; stars <= i ; stars++){
					System.out.print("* ");
					}
				
			System.out.println();	
			}
			}
			}
					
		