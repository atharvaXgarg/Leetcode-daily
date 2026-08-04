class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0,ss=0;
        while(n!=0){
            int k=n%10;
            ds+=k;
            ss+=(int)Math.pow(k,2);
            n/=10;
        }
        return (ss-ds)>=50;
    }
}
