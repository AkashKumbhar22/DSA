class Per{
public static boolean Per(int n)
{
int temp = n;
int sum = 0;
for(int i = 1 ; i<=n/2 ; i++)
{
	if(n%i==0){
	sum = sum + i;
	}
	
	}
	return temp == sum;
		}
		
public static void main(String [] args)
{
	
if(Per(7)){
	System.out.println("It is a prime Numbewr");
}
else
{
	System.out.println("It is not a prime Num");
}
}
}
