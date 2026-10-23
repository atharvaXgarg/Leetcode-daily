class Solution {
    public int minCostToMoveChips(int[] nums) {
        int esum=0,osum=0;
       for(int i=0;i<nums.length;i++){
          if(nums[i]%2==0){
            esum++;
          }else{
            osum++;
          }
       }
       return (int)Math.min(esum,osum);
    }
}