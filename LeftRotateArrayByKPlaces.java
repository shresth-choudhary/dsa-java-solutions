class Solution {
    public void rotateArray(int[] nums, int k) {
        while(k!=0)
        {
            int swap=nums[0];
        for(int i=1;i<=nums.length-1;i++)
        {
            nums[i-1]=nums[i];
            
        }
        nums[nums.length-1]=swap;
        k--;
        }
        
    }
}