class Solution {
    public int search(int[] nums, int target) {
        int res=-1;
        int i;
        for( i=0;i<nums.length;i++){
              if(nums[i]==target){
                res=i;
                break;
              }
        }
        
        return res;
    }
}
