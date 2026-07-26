class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap <Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hm.put(nums[i],true);
            }
        }
        for(int i=1;i<=hm.size();i++){
            if(hm.getOrDefault(i,false)==false){
                 return i;
            }
        }
        return hm.size()+1;
      
    }
}
