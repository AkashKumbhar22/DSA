/*
class Solution {
    public static void main (String[] args) {
        int m[] = {1,2,3,1};
		for(int i = 0 ; i < m.length ; i++)
		{
			for(int j = i+ 1 ; j < m.length ; j++)
			{
				if(m[i] == m[j])
				{
				System.out.println(i + "It has  a dupliacte value ");
				}
				else
					System.out.println(i + "It has not a dupliacte value ");

			}
		
    }
}
}*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i+ 1 ; j <nums.length;j++){
                if(nums[i] == nums[j]){
				return true;
				break;
				}
            }   
				
        }
        return false;
    }
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,1};

  Solution obj = new Solution();
        System.out.println(obj.containsDuplicate(nums));	
		}

}


	