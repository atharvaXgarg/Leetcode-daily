class Solution {
    public int bitwiseComplement(int n) {
      int num=n;//copy of n
      int mask=0;
      if(n==0) return 1;
      while(num!=0){
        mask=((mask<<1)|1);
        num=num>>1;
      }
      return (mask &(~n));
       
    }
}
