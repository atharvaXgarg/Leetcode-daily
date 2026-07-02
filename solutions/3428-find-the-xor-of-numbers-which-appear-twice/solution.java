class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums); int count=0,a=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count==1){
                    a=a^nums[i];
                }
            }
            else{ count=0;}
        } return a;
    }
}
