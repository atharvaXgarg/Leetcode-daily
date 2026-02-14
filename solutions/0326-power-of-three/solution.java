class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
       
       int i; 
       if(n==2147483647) return false;
        for( i=0; i<n; i++){
            if((int)Math.pow(3,i)>=n)break;
        }
       
        return (int)Math.pow(3,i)==n;
    
    }
}
