class Solution {
    public void moveZeroes(int[] arr) {
        // count zeroes
        int j=0,count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) {
                count++;
           }
           else arr[j++]=arr[i];
        }
        for(int i=arr.length-count; i<arr.length; i++){
            arr[i]=0;
        }
       

    }
}
