class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // 1. Calculate the expected sum using the formula n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;
        
        // 2. Loop through the array ONCE to find the actual sum
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i]; // This is shorthand for actualSum = actualSum + nums[i]
        }
        
        // 3. The difference is the missing number
        return expectedSum - actualSum;
    }
}