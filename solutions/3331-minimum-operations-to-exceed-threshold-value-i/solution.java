class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                sum++;
            }
        }
        return sum;
    }
}
