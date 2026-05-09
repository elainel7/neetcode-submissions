class Solution {
    public int[] twoSum(int[] nums, int target) {
        // visit it, add it to the hashmap if target minus it is not in the hashmap
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int dif = target - num;
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif) , i};
            }
            map.put(num, i);
       }  

       return new int[]{};


    }
}
