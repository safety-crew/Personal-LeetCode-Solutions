class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurence = new int[26];
        int left = 0, right;
        int answer = 0;
        int maxOccurence = 0;

        for (right = 0; right < s.length(); right++) {
            maxOccurence = Math.max(maxOccurence, ++occurence[s.charAt(right) - 'A']);

            if (right - left + 1 - maxOccurence > k) {
                occurence[s.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
