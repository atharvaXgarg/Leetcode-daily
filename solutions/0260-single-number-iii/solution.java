class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(j==2) return arr;
            if(hm.get(nums[i])==1){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}
