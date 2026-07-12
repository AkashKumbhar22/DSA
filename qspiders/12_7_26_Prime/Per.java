class Per{
public static int Per(int n)
{
int temp = n;
int sum = 0;
for(int i = 1 ; i<=n/2 ; i++)
{
	if(n%i==0){
	sum = sum + i;
	}
	
	}
	if(sum == temp)
	{
		return temp;
		}

		}
		
public static void main(String [] args)
{
	int a = Per(26);
	System.out.println(a);
}
}