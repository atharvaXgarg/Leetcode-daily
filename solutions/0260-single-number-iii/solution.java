class Solution {
    public int[] singleNumber(int[] nums) {
        int n =nums.length; int j=0;
        int arr[]=new int[2];
        HashMap <Integer, Integer>hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
           hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                arr[j]=nums[i];
                j++;
                if(j==2) break;

            }
        }
        return arr;
    }
}
