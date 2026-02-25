class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int [m],p=0;
        Arrays.fill(arr, -1);
        for(int i=0; i<m; i++){
            int j=0;
            while(nums2[j]!=nums1[i]){
                j++;
            }
            for(int k=j+1; k<n; k++){
                if(nums2[k]>nums2[j]){
                    arr[p]=nums2[k];
                    break;
                } 
            } p++;
        } return arr;
    }
}
