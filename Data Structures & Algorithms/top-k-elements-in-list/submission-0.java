class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        // created a map of the counts


        // build the heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> counts.get(n1) - counts.get(n2));
        for (int n : counts.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.remove(); // since it's a minheap, we remove the top item since it is the smallest
        }

        int[] top = new int[k];
        for (int i = k-1 ; i >= 0; i--) {
            top[i] = heap.poll();
        }

        return top;


    }
}
