class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int k=nums.length-1;
        return (nums[k]*nums[k-1]-nums[0]*nums[1]);
    }
}
