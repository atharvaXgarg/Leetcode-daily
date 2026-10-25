class Solution {
    public int findPeakElement(int[] arr) {
          // our moto is to find element at which right half is increasing, left half is decreasing
           int k =arr.length;
        if(k==1){
            return 0;
        }
        if(arr[k-1]>arr[k-2]){
            return k-1;
        }
        else if(arr[0]>arr[1]){
            return 0;
        }
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start)-(start-end)/2;
            if(arr[mid+1]>arr[mid]){
                // we're in left half ascending order
                // so we should go towards right half
                start=mid+1; 
            }else{
                // we're in right half ascending order
                // so we should go towards left half
                end=mid-1;
            }
        }
        return start;
    }
}