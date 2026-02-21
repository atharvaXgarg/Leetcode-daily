class Solution {
    public int smallestIndex(int[] nums) {
        int k=-1,i;
        int n;
        if(nums.length>28) {
            n=28;
        }
        else n=nums.length;
        for( i=0; i<n; i++){
            int sum=0;
            while(nums[i]!=0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum==i){
                k=i; break;
            }
        } return k;

    }
}
