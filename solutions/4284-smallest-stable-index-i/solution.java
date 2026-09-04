class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max=nums[0],min=nums[nums.length-1];
            for(int j=0;j<i+1;j++){
                if(max<nums[j]){
                    max=nums[j];
                }
            }
              for(int j=i;j<nums.length;j++){
                if(min>nums[j]){
                    min=nums[j];
                }
            }
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
}
