class Solution {
    public int findDuplicate(int[] nums) { 
        // trick: nums in the array are ints of 1 to nums
        // so the value in the array will always point to something in the array
        // find the beginning of a cycle. Floyd's algorithm
        // slow pointer +1 index reads, fast pointer +2 index reads
        // once they meet, we use this
        // the distance between here and the start of the cycle is the same as the distance between the start of the array and the start of the cycle
        // leave the slow pointer there
        // take a second slow pointer and put it at the beginning of the array
        // keep shifting each by one, and once they intersect then that is the result
        int slow = 0;
        int fast = 0;
        do  { // using do while because we are starting with them equal, both 0!
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        int beginning = 0;
        while (beginning != slow) {
            beginning = nums[beginning];
            slow = nums[slow];
        }
        return beginning; // returning beginning not nums[beginning] because we are already updated to the duplicate number
        

        // however, faang usually asks you do not modify the nums array.
        // trick: nums in the array are ints of 1 to nums
        // for (int num : nums) {
        //     int idx = Math.abs(num) - 1;
        //     if (nums[idx] < 0) {
        //         return Math.abs(num);
        //     }
        //     nums[idx] *= -1;
        // }
        // return -1;
    }
}
