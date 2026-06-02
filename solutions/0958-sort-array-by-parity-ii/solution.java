class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int []odd=new int[nums.length/2];
        int []even=new int[nums.length/2];
        int a=0,b=0;
        for(int i=0; i<nums.length;i++){
            if((nums[i]&1)==0){
                even[a]=nums[i];
                a++;
            }
            else {
                odd[b]=nums[i];
                b++;
            }
        } a=0; b=0;
        for (int i=0;i<nums.length;i++){
            if((i&1)==0){
                nums[i]=even[a]; a++;
            }
            else {nums[i]=odd[b]; b++;}
        } return nums;
    }
}
