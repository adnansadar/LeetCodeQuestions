public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        if (target > nums[nums.length - 1])
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < target && nums[i] > target)
                ans = i;
        }
        return ans;
    }
}
