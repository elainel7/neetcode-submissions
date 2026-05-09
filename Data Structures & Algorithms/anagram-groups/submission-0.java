class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // map count of each string to list of anagram
        HashMap<String, List<String>> dict = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // make the key a tuple of the int[] count array
            String key = Arrays.toString(count);
            // gets the list or creates a new list
            List<String> list = dict.getOrDefault(key, new ArrayList<>());
            list.add(s);
            dict.put(key, list);
        }
        return new ArrayList<>(dict.values());

    }
}
