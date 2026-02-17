class Solution {
    public int search(int[] nums, int target) {
        int left=0; int right=nums.length-1;int mid=-1;
        while(left<=right){
             mid=(left+right)/2;
            if(nums[mid]==target)break;
            else if(nums[mid]>target){right=mid-1;}
                 else left=mid+1;
        }
        if(nums[mid]!=target) return -1;
        else return mid;
    }
}
