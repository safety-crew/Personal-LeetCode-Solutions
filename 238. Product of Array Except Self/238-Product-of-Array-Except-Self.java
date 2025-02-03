class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create the answer array
        int[] answer = new int[nums.length];

        // fill the array with 1s by default for easier multiplications
        Arrays.fill(answer, 1);

        // Initialize prefix and postfix variables to keep track
        // of multiplications for answer array
        int prefix = 1, postfix = 1;

        // Iterate over the nums array from right to left
        // Update the prefix variable while populating answer array
        for(int i = 0; i < nums.length; i++) {
            // populate the answer array with the prefix
            answer[i] = prefix;

            // update the value of prefix
            prefix = nums[i] * prefix;
        }

        // Iterate over the answer array from left to right
        // update the answer array and postfix variable
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] *= postfix;
            postfix = nums[i] * postfix;
        }

        return answer;
    }
}
