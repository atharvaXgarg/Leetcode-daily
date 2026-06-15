class Solution {
    public int divide(long dividend, long divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        return (int)(dividend/divisor);
       
       }
    }

