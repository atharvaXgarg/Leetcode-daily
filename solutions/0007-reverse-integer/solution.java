class Solution {
    public int reverse(int num) {
        int k;
        int result=0;
        while(num!=0){
        if(result<Integer.MIN_VALUE/10 || result>Integer.MAX_VALUE/10){
            result=0; break;
        }
        else {
            int rem=num%10;
             result =result*10+rem;
            num/=10;
        }
        }
    
return result;
    }
}
