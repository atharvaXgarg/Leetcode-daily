class Solution {
    public int[] replaceElements(int[] arr) {
        int k=arr.length;
        int[] arr2=new int[k];
        arr2[k-1]=-1;
        for(int i=0;i<k-1;i++){
            int max=-1;
            for(int j=i+1;j<k;j++){
             if(arr[j]>max){
                max=arr[j];
             }

            }
            arr2[i]=max;
        } return arr2;
    }
}
