class Solution {
    int pro(int num){
        int k=1;
        while(num!=0){
            k*=num%10;
            num/=10;
        }
        return k;
    }
    public int smallestNumber(int n, int t) {
        while(pro(n)%t!=0){
          n++;
        }
        return n;
    }
}
