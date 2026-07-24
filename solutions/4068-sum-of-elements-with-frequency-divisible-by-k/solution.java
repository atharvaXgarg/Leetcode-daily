class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int []arr=new int[100];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]+=1;
        }
        int sum=0;
        for(int i=0;i<100;i++){
            if(arr[i]!=0 && arr[i]%k==0){
                sum+=(i+1)*arr[i];
            }    
        }
        return sum;
    }
}
