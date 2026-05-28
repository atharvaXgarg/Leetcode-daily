class Solution {
    public void opr(int[] num,int s){
        int k=0;
        for(int i=1;i<num.length;i++){
           if(num[k]>num[i]){
            k=i;
           }
        }
        num[k]*=s;
    }
    public int[] getFinalState(int[] nums, int k, int mult) {
         for(int i=0;i<k;i++){
            opr(nums,mult);
         }
         return nums;

        }
    
}
