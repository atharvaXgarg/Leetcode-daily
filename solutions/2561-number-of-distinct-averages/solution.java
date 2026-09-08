class Solution {
    public int distinctAverages(int[] nums) {
        // method 1 tc=O(nlog(n))
        Arrays.sort(nums);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length/2;i++){
            hs.add(nums[i]+nums[nums.length-1-i]);
        }
        return hs.size();
    }
}
