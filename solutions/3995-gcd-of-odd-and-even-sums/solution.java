class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=n*(n+1);
        int b=n*n;
        int k=a%b;
        while(k!=0){
            a=b; b=k;
            k=a%b;
        }
        return b;

    }
}
