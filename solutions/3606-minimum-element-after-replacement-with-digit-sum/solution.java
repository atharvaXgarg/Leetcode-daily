class Solution {
    public int minElement(int[] nums) {
      for(int i=0;i<nums.length;i++){
         int k=nums[i];
         int sum=0;
         while(k!=0){
            sum+=k%10;
            k/=10;
         }
         nums[i]=sum;
      }
      int min=nums[0];
      for(int i=1;i<nums.length;i++){
        if(min>nums[i]){
            min=nums[i];
        }
      } 
      return min;  
    }
}
