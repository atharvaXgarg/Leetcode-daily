class Solution {
    public boolean checkStraightLine(int[][] co) {
        if(co.length==2) return true;
        // properties of straight line
        // slope y2-y1/ x2-x1
        if(co[0][0]-co[1][0]==0){
        for(int i=0;i<co.length-1;i++){
            if(co[i][0]-co[i+1][0]!=0){
                return false;
            }
        }
        return true;
        }
        else{
            double d=(co[0][1]-co[1][1])/(1.0*(co[0][0]-co[1][0]));
            for(int i=0;i<co.length-1;i++){
                double j=(co[i][1]-co[i+1][1])/(1.0*(co[i][0]-co[i+1][0]));
                if(j!=d){
                    return false;
                }
            }
            return true;
        }
    }
}
