class Solution {
    public void sortColors(int[] a) {
        int ones=0,zeroes=0,twos=0;
       for(int i=0; i<a.length ;i++){
        if(a[i]==0) zeroes++;
        else if(a[i]==1)ones++;
        else twos++;
       }
       for(int i=0; i<a.length;i++ ){
        if(i>=0 && i<zeroes) a[i]=0;
        else if(i>=zeroes && i<zeroes+ones)a[i]=1;
        else a[i]=2;
       }
    }
}