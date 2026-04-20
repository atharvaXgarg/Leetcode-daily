class Solution {
    public int totalMoney(int n) {
       int sum=0,k=1;
        for(int i=1;i<=n;i++){
            if(i>1 && (i-1)%7==0){
                k=(i/7)+1;
            }
            sum+=k;
            k++;
        } return sum;
    }
}
