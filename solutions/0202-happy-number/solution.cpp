class Solution {
public:
    int sumOfSquare(int n){
        int sum=0;
        while(n>0){
            int i = n%10;
            sum+=(i*i);
            n/=10;
        }
        return sum;
    }
    bool isHappy(int n) {
        int sum=sumOfSquare(n);
        while(true){
            if(sum == 1){
                return true;
            }
            else if(sum == 37){
                return false;
            }
            sum = sumOfSquare(sum);
        }
        return false;
    }
};
