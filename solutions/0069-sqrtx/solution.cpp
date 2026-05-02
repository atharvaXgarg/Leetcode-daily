class Solution {
public:
    int mySqrt(int x) {
          if(x==1) return 1;
        long long i;
        for( i=0; i<=x/2; i++){
           if(i*i>x){
            break;
           }
        } return(int) i-1;
    }
};
