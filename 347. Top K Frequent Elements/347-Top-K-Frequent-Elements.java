class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // If k equals the length of the nums array
        // return the nums array itself
        if (k == nums.length) {
            return nums;
        }

        // Initializing HashMap with key representing
        // some value. And, value representing how
        // many times did that value occur.
        Map<Integer, Integer> countMap = new HashMap<>();

        // Loops over the nums array and puts each number
        // of the array in the hashmap with their count
        // getOrDefault checks if the value of such
        // key exists, if it exists, it pulls that value
        // and add 1 to it incrementing it as the number of time
        // it occured increase, if it doesn't exist, it puts 0
        // and add 1 to it.
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Initializing Priority Queue and declare the
        // insertion condition it should follow to insert
        // new entries <Comparable>.
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> countMap.get(a) - countMap.get(b)
        );

        // Iterate over each key in the map
        // then add it to the heap after comparing it
        // as mentioned in the queue declaration above.
        // Then, if the size of the heap is greater than k
        // the heap should then remove the least occured element.
        for (int num: countMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Initialize the answer array of size k.
        int[] answer = new int[k];
        
        // Iterate and fill each entry in the array with
        // the values in the heap.
        for (int i = 0; i < k; i++) {
            answer[i] = heap.poll();
        }

        return answer;
    }
}
