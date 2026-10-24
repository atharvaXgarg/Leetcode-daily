class Solution {
    public int[] searchRange(int[] arr, int tar) {
        
        int []nums={-1,-1};
        if (arr.length==0){
            return nums;
        }

        
        // calculate 1st occurrence (start)
        int start=0,end =arr.length-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(tar>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        int k;
        if(start>=arr.length || arr[start]!=tar){
           return nums;
        }else{
            k=start;
        }
        
                 
        // calculate last occurrence (end)
        start=0;end =arr.length-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(tar>=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        int l=end;
        nums[0]=k;nums[1]=l;
        return nums;
        

        
    }
}