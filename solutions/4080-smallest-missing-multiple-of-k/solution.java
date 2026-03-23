class Solution {
    public boolean search(int []nums, int k){
        for(int i=0; i<nums.length ;i++){
            if(nums[i]==k) return true;
        }
        return false;
    }
    public int missingMultiple(int[] nums, int k) {
        int a=1,result;
        while(true){
            if(!(search(nums,k*a))){
                result=k*a; break;
            } a++;
        }
        return result;
    

    }
}
