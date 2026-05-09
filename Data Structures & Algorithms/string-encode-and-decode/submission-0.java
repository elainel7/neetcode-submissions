class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for (String s : strs) {
            res += s.length() + "#" + s;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j += 1;
                // now j is at the pound character
                
            }
            int length = Integer.parseInt(str.substring(i, j));
            // now we have the length of the word
            res.add(str.substring(j + 1, j + length + 1));
            i = j + length + 1;

        }
        return res;
    }
}
