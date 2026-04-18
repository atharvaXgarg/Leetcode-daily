class Solution {
    public int mirrorDistance(int n) {
        long d=0 , d2=n;
        if(n<=9) return 0;
        while(d2!=0){
            d=d*10+d2%10;
            d2/=10;
        }
        int diff= (int) Math.abs(n-d);
        return diff;

    }
}
