class Solution {
public:
    int trailingZeroes(int n) {
         int count=0;
            for(int i=5; i<=n ;i+=5){
               count++;
               int j=i/5;
               while(j%5==0){ count++; j/=5;}
            
            }  return count;
    }
};
