class Solution {
    public static void main(String[] args){
	int x = 970;
        int temp = x;
        int rev = 0;
        while(x>0){
            int d = x % 10;
          // if(d == 0){
		//	continue;}
		//	else 
            rev = rev * 10 + d;
            x = x /10;
        }
		System.out.println(rev);

    }
}