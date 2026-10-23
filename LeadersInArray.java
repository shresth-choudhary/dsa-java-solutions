java.util.Collections;
class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        int max=nums[n-1];
        leaders.add(max);
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}