class Solution {
    public int maxProduct(int n) {
        int min=0,prev=0;
       while(n!=0){
           if(n%10>=min){
            prev=min;
            min=n%10;
           }
           else if(n%10>=prev){
            prev=n%10;
           }
            n/=10;
       } return prev*min;
    }
}
