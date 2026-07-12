class Per{
public static String Per(int n)
{
int temp = n;
int sum = 0;
for(int i = 0 ; i<=n/2 ; i++)
{
	if(n%i==0){
	sum = sum + i;
	}
	
	}
	if(sum == temp)
	{
		return temp + " is perfect number";
		}
	else
		{
		return n + "Is mot prime number";}
		}
		}
		
public static void main(String [] args)
{
	String a = Per(20);
	System.out.println(a);
}