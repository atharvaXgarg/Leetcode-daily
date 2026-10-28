class Solution {
    int peice(int[]arr,int mid){
        int sum=0,count=1;
        for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         if(sum>mid){
            count+=1;
            sum=arr[i];
         }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        /// find max value and min value
        int max=0,min=nums[0];
        for(int i:nums){
            max+=i;
            if(min<i){
                min=i;
            }
        }
        int start=min;int end=max;
        while(start<end){
           int mid=start-(start-end)/2;
           if(peice(nums,mid)<=k){
            end=mid;
           }else{
            start=mid+1;
           }
        }
        return end;

    }
}
