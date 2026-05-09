class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // Time: O(nlogn)
        Arrays.sort(nums);
        // + O(n^2) = O(n^2)
        // Space: could be O(1) or O(n) depending on sorting library
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];
                if (threeSum > 0) r -= 1;
                else if (threeSum < 0) l += 1;
                else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l += 1;
                    while (nums[l] == nums[l - 1] && l < r) l += 1;
                }
            }
        }

        return res;
    }
}
