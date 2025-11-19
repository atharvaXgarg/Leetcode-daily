class Solution {
    public int singleNumber(int[] nums) {
        int i,count;int x=0;
       for(i=0;i<nums.length;i++){
        x=x^nums[i];
       }
       return x;
    }
}

    
