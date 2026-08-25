class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
          if(nums.length%(i+1)!=0){
            continue;
          }
          sum+=Math.pow(nums[i],2);
        }
        return sum;
    }
}
