class Solution {

    public int countConsistentStrings(String al, String[] words) {
        int[] arr = new int[26];
        for (int i = 0; i < al.length(); i++) {
            arr[(int) al.charAt(i) - 97]++;
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean b = true;

            for (int j = 0; j < words[i].length(); j++) {
                if (arr[(int) words[i].charAt(j) - 97] == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                count++;
        }
        return count;
    }
}
