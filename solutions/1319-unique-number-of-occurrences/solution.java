class Solution {
    public boolean uniqueOccurrences(int[] nums) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
      // hashMap size== no of unique elements
      HashSet <Integer> hs=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        hs.add(hm.get(nums[i]));
      }
      return hs.size()==hm.size();
    }
}
