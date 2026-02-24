class Solution {
    public int missingNumber(int[] nums) {
         int n=nums.length, ctr=0;
        for(int i=0; i<n; i++){
            ctr+=nums[i];
        }
        return ((n*(n+1))/2)-ctr;
    }
}
