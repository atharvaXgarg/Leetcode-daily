class Solution {
    public boolean canAliceWin(int n) {
        // 1st alice 10 than bob 9 , 2nd alice 8 bob 7 , 3rd alice 6 bob 5 & so on....
        // if last stones was removed by alice than she is winner 
        int init=10; int count=0; // as alice remove at 0,2,4,.... and bob at 1,3,5,7...
        while(init<=n){
            n=n-init;
            init--;
            count++;
        }
        return count%2==1;
       
        
    }
}
