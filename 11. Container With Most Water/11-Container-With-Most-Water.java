class Solution {
    public int maxArea(int[] height) {
        // The idea is about initializing two pointers left and right.
        // If left > right => right = right - 1 => Calculate area => area > max ? max = area
        // If right > left => left = left + 1... same as before.

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;

            max = Math.max(max, area);

            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
