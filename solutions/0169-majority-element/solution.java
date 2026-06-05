class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0,max=0,index=0;
       for(int i=1;i<nums.length;i++){
        int j=i-1;
       if(nums[j]==nums[i]){
        count++;
        if(count>max){
            max=count;
            index=j;
        }
       }
       else{
        count=0;
       }
       }
       return nums[index];

    }
}
