import java.util.Scanner;

class rev_no_tri{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n:");
		int n = sc.nextInt();
		
		for(int i = 1 ; i < n ; i++){
				for(int stars = 1 ; stars <= n-i ; stars++){
					System.out.print(stars);
					}
			System.out.println();	
			}
			}
			}
					
		