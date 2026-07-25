class Solution {
    public boolean isNonZero(int a, int b){
      while(a!=0){
        if(a%10==0){
            return false;
        }
        a/=10;
      }
       while(b!=0){
        if(b%10==0){
            return false;
        }
        b/=10;
      }
      return true;
    }
    public int[] getNoZeroIntegers(int n) {
          int [] arr=new int[2];
          int k=n-1;
        while(!(isNonZero(k,n-k))){
            k--;
        }
        arr[0]=k;
        arr[1]=n-k;
        return arr;
       }
    }

