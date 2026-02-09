class Solution {
    public int theMaximumAchievableX(int num, int t) {
        t=Math.abs(t);
        return (num+(t<<1));
        
    }
}
