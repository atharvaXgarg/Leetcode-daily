class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[]arr=new int[m+n];
        while(i!=m && j!=n){
            if(nums1[i]>=nums2[j]){
                arr[k]=nums2[j];
                j++;
            }
            else{
                arr[k]=nums1[i]; i++;
            }
            k++;
        }
        if(i!=m){
            for(int p=i;p<m;p++){
                arr[k]=nums1[p];
                k++;
            }
        }
        else{
            for(int p=j;p<n;p++){
                arr[k]=nums2[p];
                k++;
            }
        } 
        for(int s=0;s<nums1.length;s++){
            nums1[s]=arr[s];
        }

    }
}
