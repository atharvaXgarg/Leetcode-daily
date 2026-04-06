class Solution {
    public double average(int[] s) {
        int max=s[0],min=s[0];
        for(int i=0;i<s.length;i++){
           if(s[i]>max)max=s[i];
           if(s[i]<min) min=s[i];
        }
        int sum=0;
        for(int i=0;i<s.length;i++){
            if(s[i]!=max && s[i]!=min ){
                sum+=s[i];
            }
        }
        return 1.0*sum/(s.length-2);
    }
}
