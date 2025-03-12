class Solution {
    public int longestConsecutive(int[] nums) {
        /* We put the elements in a HashSet at first,
           then, for each element in the HashSet we check
           if there exists an element less than it by 1.
           If none, we start from that element upwards and
           try to find whether there exists an element greater
           than that element by 1.. causing the longest consecutive
           number of elements to increase as we traverse the HashSet. */

        if (nums.length == 0) {
            return 0;
        }

        // Used to eliminate duplicate values.
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        int longestConSub = 1;
        for (int num: numSet) {
            // If the element isn't the starting to a subsequent
            // Ignore it.
            if (numSet.contains(num - 1)) {
                continue;
            } else {
                // Define the current starting subsequent element.
                int currentNum = num;
                // Define the counter that holds the current maximum
                // consecutive subsequent.
                int currentMaxSub = 1;

                // Check the length of the subsequent for the current
                // number.
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentMaxSub += 1;
                }

                longestConSub = Math.max(longestConSub, currentMaxSub);
            }
        }

        return longestConSub;
    }
}
