class Solution {
    public boolean isGood(int[] nums) {
        
      HashMap<Integer,Integer> hm=new HashMap<>();
      if(nums.length==1){
        return false;
      }
      for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
      }
      for(int i=1;i<nums.length;i++){
        if(!(hm.containsKey(i))){
            return false;
        }
      }
      for(int i=1;i<nums.length-1;i++){
        if(hm.get(i)!=1){
            return false;
        }
      }
      if(hm.get(nums.length-1)==2){
        return true;
      }
      return false;
    }
}
