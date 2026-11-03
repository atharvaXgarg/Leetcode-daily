class Solution {
    public int minMoves(int[] nums) {
        /// find max
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
          if(max<nums[i]) max=nums[i];
        } 
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=(max-nums[i]);
        }
        return res;
    }
}
