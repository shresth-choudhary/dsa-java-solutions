class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        if(nums[i]>0)
        {
            pos[j++]=nums[i];
        }
        else
        {
            neg[k++]=nums[i];
        }
        j=0;
        k=0;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                result[i]=pos[j++];
            }
            else
            {
                result[i]=neg[k++];
            }
        }
        return result;
    }
}