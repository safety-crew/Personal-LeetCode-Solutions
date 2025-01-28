class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Check length for each of s, and t.
        // 2. Use an array that represents all English alphabet (a -> z) [length: 26 fixed].
        // 3. In that array.. we check each string (s and t) for the frequency of each
        //    letter. As we move through s, we increment that index, and as we move through
        //    t, we decrement that index. The array should have all zeros if the two strings
        //    are anagrams.

        if (s.length() != t.length()) {
            return false;
        }

        int[] charsNum = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charsNum[s.charAt(i) - 'a']++;
            charsNum[t.charAt(i) - 'a']--;
        }

        for (int num: charsNum) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
