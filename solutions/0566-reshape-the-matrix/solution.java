class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // check compatiblity
        int rm=mat.length, cm=mat[0].length;
        if(rm*cm !=r*c || (rm==r && cm==c)){
            return mat;
        }
        else{
             // convert in to 1-D array first
             int [] arr=new int[rm*cm];
             int s=0;
             for(int i=0;i<rm;i++){
                for(int j=0;j<cm;j++){
                    arr[s]=mat[i][j];
                    s++;
                }
             }
             int [][]ar=new int[r][c];
             int k=0;
             for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    ar[i][j]=arr[k];
                    k++;
                }
             }
             return ar;
        }
    }
}
