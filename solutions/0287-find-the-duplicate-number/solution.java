class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer>hm=new HashMap<>();
        int i;
    for( i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        if(hm.get(nums[i])>1){
           break;
        }
    }
    return nums[i];
    }
}
