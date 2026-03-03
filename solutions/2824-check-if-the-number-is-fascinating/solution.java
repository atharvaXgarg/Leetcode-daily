class Solution {
    public boolean isFascinating(int n) {
       HashSet<Integer>ts=new HashSet<Integer>();
      if(n>333) return false;
       int m=2*n; int k=3*n;
       for(int i=0; i<3; i++){
         ts.add(m%10);
         ts.add(n%10);
         ts.add(k%10);
         k/=10; m/=10; n/=10;
       } if(ts.contains(0))return false;
       else if (ts.size()==9) return true;
       return false;
        
    }
}
