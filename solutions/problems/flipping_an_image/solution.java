class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length/2;j++){
            int swap=nums[i][j];
            nums[i][j]=nums[i][nums[i].length-1-j];
            nums[i][nums[i].length-1-j]=swap;
        }
       }
       // inverting
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            nums[i][j]=(nums[i][j]^1);
        }
       }
       return nums;
    }
}