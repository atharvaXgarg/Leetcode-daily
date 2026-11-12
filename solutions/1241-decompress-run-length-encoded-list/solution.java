class Solution {
    public int[] decompressRLElist(int[] nums) {
        // get array length
        int length=0;
        for(int i=0;i<nums.length;i+=2){
            length+=nums[i];
        }
        // filling array
        int []arr=new int[length];
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                 arr[k]=nums[i+1];
                 k++;
            }
        }
        
        return arr;
    }
}
