class Solution {
    public boolean checkDivisibility(int num) {
        int sum=0,pro=1;
        int n=num;
        while(n!=0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return (num%(sum+pro)==0);
    }
}
