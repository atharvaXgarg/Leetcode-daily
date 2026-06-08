class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Using 2 ptr approach
        int l=0, r=nums.length-1;
        while(r>l){
            if(nums[l]%2!=0 && nums[r]%2==0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            else if(nums[l]%2==0){
                l++;
            }
            else if(nums[r]%2!=0){
                r--;
            }
        }
        System.out.print(nums.length);
        return nums;
    }
}
