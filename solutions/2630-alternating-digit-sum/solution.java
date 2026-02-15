class Solution {
    public int alternateDigitSum(int n) {
      int sum=0,k=1;
      while(n!=0){
        if(k%2!=0)sum+=n%10;
        else sum-=n%10;
        k++; n/=10;
      }if(k%2==0) return sum;
      return -1*sum;
    }
}
