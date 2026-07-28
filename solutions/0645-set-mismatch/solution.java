class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[nums.length];
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]-1]==2){
                res[0]=nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0){
                res[1]=i+1;
                break;
            }
        }
        return res;
    }
}
