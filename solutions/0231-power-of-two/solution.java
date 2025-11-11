class Solution {
      public int hammingWeight(int n) {
        int sum=0;
        while(n!=0){
            if(sum >1){
                break;
            }
            sum+=n&1;
            n=n>>1;
        }
        return sum;
    }
    public boolean isPowerOfTwo(int n){
        if(hammingWeight(n)==1) return true;
        else return false;
    }
    
   }
