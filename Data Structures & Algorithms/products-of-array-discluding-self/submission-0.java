class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = pre;
            pre = nums[i] * pre;
        }

        int post = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * post;
            post = nums[i] * post;
        }

        return output;

        // int[] prefix = new int[nums.legnth + 1];
        // int[] postfix = new int[nums.length + 1];
        // prefix[0] = 1;
        // for (int i = 1; i < nums.length + 1; i++) {
        //     prefix[i] = nums[i] * prefix[i - 1];
        // }
        // // prefix: 1, 1, 2, 8, 48
        // postfix[nums.length] = 1;
        // for (int i = nums.length - 1; i >= 0; i++) {
        //     postfix[i] = nums[i] * prefix[i + 1];
        // }
        // // postfix: 48, 48, 24, 6, 1

        // int[] output = new int[nums.length];
        // for (int i = 1; i < nums.length; i++) {
        //     output[i] = 
        // }
    }
}  
