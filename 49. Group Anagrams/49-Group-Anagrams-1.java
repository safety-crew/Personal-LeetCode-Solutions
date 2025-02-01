class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Build HashMap:
        // Keys are String representation of 1 | 0 pairs with the length of
        // 26 which is the number of alphabet letters, where indices start
        // from a --> z such that when letter exists, put 1 in the index of
        // that letter.
        // Values are the words that have the same String representation
        // (e.g. cab and abc have the same String representation of
        // 1110000...) making the values equal to ['abc', 'cab']

        if (strs.length == 0) {
            return new ArrayList();
        }

        Map<String, List> map = new HashMap<>();
        int[] count = new int[26];

        for (String str: strs) {
            Arrays.fill(count, 0);

            for (char chr: str.toCharArray()) {
                count[chr - 'a']++;
            }

            StringBuilder strBuild = new StringBuilder("");

            for (int i = 0; i < count.length; i++) {
                strBuild.append('#');
                strBuild.append(count[i]);
            }

            String key = strBuild.toString();

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }

            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}
