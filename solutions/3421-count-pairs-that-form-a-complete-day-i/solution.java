class Solution {
    public int countCompleteDayPairs(int[] hr) {
        int count=0;
        for(int i=0;i<hr.length-1;i++){
            for(int j=i+1;j<hr.length;j++){
               if((hr[i]+hr[j])%24==0){
                count++;
               }
            }
        }
        return count;
    }
}
