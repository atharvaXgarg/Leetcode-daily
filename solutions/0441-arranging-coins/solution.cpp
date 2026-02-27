class Solution {
public:
    int arrangeCoins(int n) {
        long  k=1;
        while((k*(k+1)/2)<=n){
            k++;
        }
        return (int)k-1;
    }
};
