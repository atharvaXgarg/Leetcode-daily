class Solution {
    private int getMinInd(int[] arr){
        int mi=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[mi]){
                mi=i;
            }
        }
        return mi;
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        // ye to O(n2) hai worst case mai , can it be reduced?
        for(int i=0;i<k;i++){
            int minInd=getMinInd(nums);
            nums[minInd]*=-1;
        }
        int sum=0;
        for(int n:nums){
          sum+=n;
        }
        return sum;
    }
}
