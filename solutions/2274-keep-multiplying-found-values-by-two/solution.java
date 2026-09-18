class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean pre=true;
        while(pre){
            int i;
            for( i=0;i<nums.length;i++){
                if(nums[i]==original){
                    pre=true;
                    original*=2;
                    break;
                }
            }
            if(i==nums.length){
                return original;
            }
            
        }
         return original;
    }
}
