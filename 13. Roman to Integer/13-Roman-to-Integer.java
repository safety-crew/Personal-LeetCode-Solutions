class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);

        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (((i != s.length() - 1) && (s.charAt(i) == 'I') && (s.charAt(i + 1) == 'V')) || ((i != s.length() - 1) && (s.charAt(i) == 'I') && (s.charAt(i + 1) == 'X'))) {
                sum -= 1;
            }
            else if (((i != s.length() - 1) && (s.charAt(i) == 'X') && (s.charAt(i + 1) == 'L')) || ((i != s.length() - 1) && (s.charAt(i) == 'X') && (s.charAt(i + 1) == 'C'))) {
                sum -= 10;
            }
            else if (((i != s.length() - 1) && (s.charAt(i) == 'C') && (s.charAt(i + 1) == 'D')) || ((i != s.length() - 1) && (s.charAt(i) == 'C') && (s.charAt(i + 1) == 'M'))) {
                sum -= 100;
            }
            else {
                sum += romanIntMap.get(s.charAt(i));
            }
        }

        return sum;
    }
}
