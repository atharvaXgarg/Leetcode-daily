class Solution {
    public int minOperations(int[] nums) {
        int sum=0,k=0;
        for(int i=1;i<nums.length;i++){
             if(nums[i-1]>=nums[i]){
                sum=nums[i-1]-nums[i]+1;
                k+=sum;
                nums[i]+=sum;
             }
        }
        return k;
    }
}
