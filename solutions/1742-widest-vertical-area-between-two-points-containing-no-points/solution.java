class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // our task is to find max width i.e max x axis dist so that no pt come in b/w
        // s1 take x axis values into array
        int k=points.length;
        int []x=new int [k];
        for(int i=0;i<k;i++){
            x[i]=points[i][0];
        }
        // s2 sort the array
        Arrays.sort(x);
        // s3 find max dist 
        int max=0;
        for(int i=1;i<k;i++){
            int m=(int)Math.abs(x[i]-x[i-1]);
            if(max<m){
                max=m;
            }
        }
        return max;
        
    }
}
