class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int finalMax = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentMax = Math.max(nums[i],currentMax+nums[i]);
            finalMax = Math.max(finalMax,currentMax);
        }
        return finalMax;
    }
}