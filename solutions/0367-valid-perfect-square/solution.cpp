class Solution {
public:
    bool isPerfectSquare(int num) {
         long sum=1,b=1;
        if(num==1)return true;
        while(sum<num){
            sum+=2*b+1; 
            b++;
        } return sum==num;
    }
};
