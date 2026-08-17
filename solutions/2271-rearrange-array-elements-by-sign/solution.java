class Solution {
    public int[] rearrangeArray(int[] nums) {
       // As it's specified that no of +ve = -ve
       int pos[]=new int[nums.length/2];
       int neg[]=new int[nums.length/2];
       int j=0,k=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            pos[j]=nums[i]; j++;
        }
        else{
            neg[k]=nums[i];k++;
        }

       }
       int p=0;
       for(int i=0;i<nums.length;i+=2){
        nums[i]=pos[p];
        nums[i+1]=neg[p];
        p++;
       }
       return nums;

    }
}
