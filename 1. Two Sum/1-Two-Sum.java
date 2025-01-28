class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Plan: target - 1st sum = 2nd sum -> (e.g. 9 - 2 = 7 -> Search for 7)
        // 1. Create a HashMap to store array elements we traverse through
        // 2. Compare any recently discovered element if the 2nd sum is present
        //    in the HashMap or not.

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if(map.containsKey(remainder)) {
                return new int[] {map.get(remainder), i};
            }

            map.put(nums[i], i);
        }
      
        // For preventing compile errors based on not returning an array by default.
        return new int[] {};
    }
}
