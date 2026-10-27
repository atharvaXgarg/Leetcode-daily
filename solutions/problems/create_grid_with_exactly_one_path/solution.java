class Solution {
    public String[] createGrid(int m, int n) {
        String[] a=new String[m];
        StringBuilder str1=new StringBuilder();
        for(int i=0 ;i<n;i++){
          str1.append(".");
        }
        StringBuilder str2=new StringBuilder();
        for(int i=0 ;i<n-1;i++){
            str2.append("#");
        } str2.append(".");
        
        
        a[0]=str1.toString();
        for(int i=1;i<m;i++){
            a[i]=str2.toString();
        }
        
       return a;
    }
}