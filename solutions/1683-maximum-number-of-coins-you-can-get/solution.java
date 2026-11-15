class Solution {
    public int maxCoins(int[] nums) {
        // we will pick up pile with 2 max and one least value
        // bob ko sort krke starting wale coins de do
        Arrays.sort(nums);
        // bob ke liye coins == 0 to nums.length/3
        // baki coins alt ek mera dusra alice ka 
        int sum=0;
        for(int i=nums.length/3;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;

        

        
    }
}
