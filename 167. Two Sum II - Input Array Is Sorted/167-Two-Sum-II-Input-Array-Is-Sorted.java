class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Define right left and sum variables
        // If sum is greater than the target value we decrease the right
        // If sum is less than the target value we increase the left

        int left = 0, right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right -= 1;
            } else if (numbers[left] + numbers[right] < target) {
                left += 1;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return null;
    }
}
