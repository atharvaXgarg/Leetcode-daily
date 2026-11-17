class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a=grid.length;
        int [] res=new int[2];
        int [] arr=new int[a*a];
        // fill array by 
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
               arr[grid[i][j]-1]++;
            }
        }
        for(int i=0;i<a*a;i++){
            if(arr[i]==1) continue;
            else if(arr[i]==0){
                res[1]=i+1;
            }else{
                res[0]=i+1;
            }
        }
        return res;
    }
}
