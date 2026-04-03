class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
     TreeSet<Integer> ts=new TreeSet<>();
     for(int i=0;i<nums.length;i++){
        ts.add(nums[i]);
     }
     int j;
     if(k>ts.size())j=ts.size();
     else j=k;
     int[] arr=new int[j];
     int b=arr.length-1;
     while(ts.size()>0 && k>0){
         arr[j-b-1]=ts.removeLast();
         b--;
         k--;
     } return arr;

         }
}
