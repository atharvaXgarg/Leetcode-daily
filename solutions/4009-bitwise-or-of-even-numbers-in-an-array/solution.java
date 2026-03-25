class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int output=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]%2==0){
                output=(output|nums[i]);
            }
        }
        return output;
    }
}
