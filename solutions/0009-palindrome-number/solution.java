class Solution {
    public boolean isPalindrome(int x) {
        int rev=0; int y=x;
        if(x<0) return false;
        else{
        while(y!=0){
            rev=rev*10+y%10;
            y/=10;
        }
        return (rev==x);
    }}
}
