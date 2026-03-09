class Solution {
    public int tribonacci(int n) {
        int a=1,b=1,c=0,sum=0;
      if(n==0) return 0;
      if(n==1 || n==2 ) return 1;
      for(int i=3; i<=n; i++){
        sum=a+b+c;
        c=b; b=a; a=sum;
      } return sum;
    }
}
