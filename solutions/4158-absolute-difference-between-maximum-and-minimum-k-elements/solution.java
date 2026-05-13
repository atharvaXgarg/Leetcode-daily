class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums); int abs=0;
        for(int i=0; i<k; i++){
            abs+=(nums[i]-nums[nums.length-i-1]);
        } return Math.abs(abs);
    }
}
