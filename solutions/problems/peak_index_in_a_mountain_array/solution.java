class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // 1st increasing than decreasing 
        // our moto is to find element at which right half is increasing, left half is decreasing
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