class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.abs(nums[i]);
        }
        long sum=0;
        // as we can arrange in any order so...
        Arrays.sort(nums);
        // find the ceil value of mid
        int a=(int)Math.ceil(nums.length/2);
        for(int i=nums.length-1;i>=a;i--){
           sum+=(int)Math.pow(nums[i],2);
        }
        for(int i=a-1;i>=0;i--){
            sum-=(int)Math.pow(nums[i],2);
        }
      return sum;
    }
}