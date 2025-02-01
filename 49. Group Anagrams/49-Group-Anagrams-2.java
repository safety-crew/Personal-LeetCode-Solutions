class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a map of String | List pair.
        // String for the representation of sorted strings
        // that will represent the anagram.
        // List to store the strings that represent the
        // similar anagrams and group them.
        // e.g. abc and cab --> Key: abc (Sorted) | value: [abc, cab]
        HashMap<String, List<String>> map = new HashMap<>();

        // loop over the strings
        for (String str: strs) {
            // convert the strings to char array for sorting.
            char[] chrArray = str.toCharArray();

            // Sort the characters of each string.
            Arrays.sort(chrArray);

            // Convert the sorted char arrays back to strings to put
            // them in the map.
            String sortedStr = new String(chrArray);

            // this function search if such key is not found,
            // if the key is not found, it will add a new key | value
            // pair containing the sorted string and an arraylist to
            // add the grouped anagrams to it.
            map.putIfAbsent(sortedStr, new ArrayList<>());

            // add the recent anagram to the arraylist of such
            // key that has the sorted anagram string.
            map.get(sortedStr).add(str);
        }

        // return the arraylist that has the grouped anagrams.
        return new ArrayList(map.values());
    }
}
