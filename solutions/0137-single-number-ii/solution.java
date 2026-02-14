class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];
        Arrays.sort(nums); int k;
        if(nums[0]!=nums[1])k=nums[0];
         else k=nums[nums.length-1];
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                k= nums[i]; break;
            };
        }
        
        return k;
    }
}
