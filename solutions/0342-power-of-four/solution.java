class Solution {
    public boolean isPowerOfFour(int n) {
        int k=n;
       int i; n=Math.abs(n);
       if(n==2147483647) return false;
        for( i=0; i<n; i++){
            if((int)Math.pow(4,i)>=n)break;
        }
       
        if(k>0)return (int)Math.pow(4,i)==n;
        else return false;
        
    }  
    }

