class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        double min =nums[n]; int left=0; int right=n;double avg;
        while(left<right){
           avg=(nums[left]+nums[right])/2.0;
           if(avg<min){
            min=avg;
           }
           left++; right--;
        }
        return min;
    }
}
