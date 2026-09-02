class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hr, int target) {
        int count=0;
        for(int i=0;i<hr.length;i++){
            if(hr[i]>=target){
                count++;
            }
        }
        return count;
    }
}
