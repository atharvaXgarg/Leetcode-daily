class Solution {
    public boolean increasing(int []nums){
        if(nums[0]>nums[1]) return false;
        else {
            for(int i=0; i<nums.length-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
        }
        return true;
    }
    public boolean decreasing(int []nums){
        if(nums[0]<nums[1]) return false;
        else {
            for(int i=0; i<nums.length-1;i++){
                if(nums[i]<nums[i+1]) return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1)return true;
        return  (increasing(nums) || decreasing(nums));
           
        
        
    }
}
