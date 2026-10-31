class Solution {
    public int minMovesToSeat(int[] se, int[] st) {
     Arrays.sort(se);
     Arrays.sort(st);
     int min=0;
     for(int i=0;i<se.length;i++){
        min+=(int)Math.abs(se[i]-st[i]);
     }
     return min;
    }
}
