class Solution {
    public int earliestTime(int[][] tasks) {
        if (tasks.length==0)return 0;
        int sum=tasks[0][0]+tasks[0][1];
        for(int i=0; i<tasks.length; i++){
           int k=0;
            for(int j=0; j<tasks[i].length ; j++){
                k+=tasks[i][j];
                
            }if(sum>k) sum=k;
            
        }
        return sum;
    }
}
