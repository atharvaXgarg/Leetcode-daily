class Solution {
    public boolean divideArray(int[] nums) {
        int arr[] =new int[500];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]-1]%2!=0){
                return false;
            }
        }
        return true;
    }
}
