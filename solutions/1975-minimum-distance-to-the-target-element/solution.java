class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=nums.length,mi=nums.length;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target) {
               min= i-start; break;
            }
        }
         for(int i=start;i>=0;i--){
            if(nums[i]==target) {
               mi= start-i; break;
            }
        }
        if(mi<min) return mi;
        return min;
       
        
    }
}
