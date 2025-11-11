class Solution {
    public int sum(int k){
        int a=0;
        while(k!=0){
         a+=k&1;
         k=k>>1;
        }
        return a;
    }
    public int[] countBits(int n) {
        int []arr=new int[n+1];
        for(int i=0; i<=n;i++){
          arr[i]=sum(i);
        }
        return arr;
    }
}
