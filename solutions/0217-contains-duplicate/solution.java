class Solution {
    public boolean containsDuplicate(int[] nums) {
        // alternate solution sort and than check
        boolean b=false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>1){
             b=true;
             break;
            }
            
        }
        return b;
       
    }
}

