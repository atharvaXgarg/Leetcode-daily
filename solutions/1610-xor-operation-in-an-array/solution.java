class Solution {
    public int xorOperation(int n, int start) {
        int k,a=0;
        for(int i=0; i<n; i++){
           k= start + 2 * i;
            a=a^k;
        }
       return a;

    }
}
