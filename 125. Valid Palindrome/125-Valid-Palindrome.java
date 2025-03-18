class Solution {
    public boolean isPalindrome(String s) {
        /**
         The solution is to initialize two pointers, one on the beginning
         and the other on the ending of the string, ignoring non-alpha
         characters the pointers keep checking if they are matching until
         they reach the same character or the left pointer exceeds the right
         pointer's index.
        */

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
