class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. We sort the array to get rid of duplicates
        // 2. We initialize i, j, and k variables as [i, j, k] solution array
        // 3. We start with i from index 0 of the array
        // 4. j and k are index 1 and last index of the array as left, right vars
        // 5.1. if nums[j] + nums[k] < nums[i], we increment j (left)
        // 5.2. if nums[j] + nums[k] > nums[i], we decrement k (right)

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                twoSum2(nums, i, result);
            }
        }

        return result;
    }

    void twoSum2(int[] nums, int i, List<List<Integer>> result) {
        int left = i + 1;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if(sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));

                while(left < right && nums[left] == nums[left - 1]) {
                    ++left;
                }
            }
        }
    }
}
