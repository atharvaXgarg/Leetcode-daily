class Solution {
    public int sumBase(int n, int k) {
        int x=0;
       while(n!=0){
          x+=n%k;
          n/=k;
       }
       return x;
    }
}
