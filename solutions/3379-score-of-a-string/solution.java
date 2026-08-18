class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int c = (int) s.charAt(i);
            int d = s.charAt(i + 1);
            sum += Math.abs(c - d);
        }
        return sum;
    }
}
