import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int num: nums) {
            if(!numSet.contains(num)) {
                numSet.add(num);
            } else {
                return true;
            }
        }

        return false;
    }
}
