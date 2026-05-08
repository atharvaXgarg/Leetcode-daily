class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int st = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] <= q && e[i] >= q) {
                st++;
            }
        }
        return st;
    }
}
