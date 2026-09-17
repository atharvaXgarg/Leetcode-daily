class Solution {
    public int dominantIndex(int[] nums) {
        // apan ko largest aur 2nd largest mai compare krna hai 
        // for finding max and 2nd max
        int large=0, slarge=0;
        int maxi=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                slarge=large;
                large=nums[i];
                maxi=i;
            }
            if(nums[i]>slarge && nums[i]!=large){
                slarge=nums[i];
            }
        }
        if(large>=2*slarge) return maxi;
        return -1;
    
    }
}
