class Solution {
    public int[] sumZero(int n) {
        int []arr=new int[n]; int k=0;
         for(int i=1; i<=n/2; i++){
                arr[k]=i; ++k;
                arr[k]=-i; ++k;
            } 
            if(n%2!=0){
            arr[k]=0;
         }
         return arr;
    }
}
