class Solution {

    

    public int missingMultiple(int[] nums, int k) {
      HashMap <Integer,Boolean>hm=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]%k==0){
            hm.put(nums[i]/k,true);
        }
      }
      for(int i=1;i<=nums.length;i++){
        if(hm.getOrDefault(i,false)==false){
            return k*i;
        }
      }

       return k*(nums.length+1);

    }
}
