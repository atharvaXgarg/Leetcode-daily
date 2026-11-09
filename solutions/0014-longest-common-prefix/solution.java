class Solution {
    public String longestCommonPrefix(String[] strs) {
        // check for string with shortest length
        int c = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < c) {
                c = strs[i].length();
            }
        }
        int i;
        for (i = 0; i < c; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                     return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
       

    }
}
