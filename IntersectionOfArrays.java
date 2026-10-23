class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j])
            {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        int result[]=new int[intersection.size()];
        for(int k=0;k<intersection.size();k++)
        {
            result[k]=intersection.get(k);
        }
        return result;
    }
}