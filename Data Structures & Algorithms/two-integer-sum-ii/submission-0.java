class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        // numbers = 1, 2, 3, 4
        // target = 3
        // l = 1, r = 4
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) r--;
            else if (numbers[l] + numbers[r] < target) l++;
        }

        res[0] = l + 1;
        res[1] = r + 1;
        return res;
    }
}
