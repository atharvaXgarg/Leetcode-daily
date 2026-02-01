class Solution {

    public boolean check(int[] nums) {
        
        int n=nums.length;
        int []arr= new int[n];
        boolean b=false;
         int[] copy = nums.clone();
          Arrays.sort(copy);
        for(int d=0; d<n; d++){
            int j=0;
            for(int i=d; i<n; i++){
                arr[j]=nums[i];
                j++;
            }
            for(int i=0; i<d; i++){
                arr[j]=nums[i];j++;
            }
            if(Arrays.equals(arr,copy)){
                b=true; break;
            }
        }
        return b;
    }
}
