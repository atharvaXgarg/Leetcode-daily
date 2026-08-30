class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>nums[max]){
            max=i;
           }
           if(nums[i]<nums[min]){
            min=i;
           }
        }
        // task 1 find min index and max index
        // task 2 minimum (taken both from front, taken both from back, one from front one from back)
        // taking from front 
        int dist=(max>min?max:min);
        int db=max>min?(nums.length-min):(nums.length-max);
        int both=max>min? (nums.length-max)+(min): (nums.length-min)+(max);
        // required distances
        int res=Math.min(dist,db-1);
        res=Math.min(res,both);
        return res+1;
    }
}
