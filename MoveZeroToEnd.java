class Solution {
    public void moveZeroes(int[] nums) {
        int temp[]=new int[nums.length];
        int j=nums.length-1;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                temp[j--]=nums[i];
            }
            else
            {
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=temp[i];
        }
    }
}