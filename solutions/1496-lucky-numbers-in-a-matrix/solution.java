class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        // minimum in row 
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }hs1.add(min);
        }
        // max in column
         for(int j=0;j<n;j++){
            int max=0;
             for(int i=0;i<m;i++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
             }hs2.add(max);

         }
         hs1.retainAll(hs2);
         ArrayList<Integer> al=new ArrayList<>(hs1);
         return al;
    }
}
