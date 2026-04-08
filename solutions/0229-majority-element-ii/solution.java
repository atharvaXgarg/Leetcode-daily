class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (int i=0;i<nums.length;i++){
            if(!(li.contains(nums[i]))&& hm.get(nums[i])>nums.length/3){
                li.add(nums[i]);
            }
        }
        return li;
    }
}
