class Solution {
    public int addedInteger(int[] n1, int[] n2) {
        int m1=n1[0], m2=n2[0];
       for(int i=0;i<n1.length;i++){
        if(m1>n1[i]){ m1=n1[i];}
        if(m2>n2[i]){ m2=n2[i];}
       }
       return m2-m1;
    }
}
