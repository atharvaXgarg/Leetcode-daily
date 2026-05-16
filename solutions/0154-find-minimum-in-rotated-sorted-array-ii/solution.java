class Solution {
    public int findMin(int[] nums) {
        int max=nums[0];
      for(int i=0;i<nums.length;i++){
        if(max>nums[i]){
            max=nums[i];
        }
      }  
      return max;
    }
}
