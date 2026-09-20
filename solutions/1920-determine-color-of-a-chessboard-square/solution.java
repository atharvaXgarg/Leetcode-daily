class Solution {
    public boolean squareIsWhite(String s) {
        int sum=(int)(s.charAt(0)+s.charAt(1))-48;
        return sum%2!=0;
    }
}
