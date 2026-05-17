class Solution {
    public int[] transformArray(int[] nums) {
        int ev=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0){
                ev++;
            }  
        }
        for(int i=0;i<ev;i++){
            nums[i]=0;
        }
        for(int i=ev;i<nums.length;i++){
            nums[i]=1;
        }
        return nums;
    }
}
