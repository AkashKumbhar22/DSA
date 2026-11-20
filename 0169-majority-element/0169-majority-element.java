class Solution {
    public int majorityElement(int[] nums) {
        int candidate =0;
        int count = 0;

        for(int i = 0; i< nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
                count++;
            }
            else if(nums[i] == candidate){
                count++;
            }
            else if(nums[i] != candidate){
                count--;
            }
        }

        count = 0;
        for(int j  = 0 ; j <nums.length ; j++){
            if(nums[j] == candidate){
                count++;
            }
        }

        int ans;
        if(count > (nums.length/2)){
            ans = candidate;
        }
        return candidate;
    }
}
