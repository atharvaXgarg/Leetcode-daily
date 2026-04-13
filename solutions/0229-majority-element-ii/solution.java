class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        if (nums.length == 1) {
            li.add(nums[0]);
            return li;
        }
        Arrays.sort(nums);
        int count = 1;
        for(int i=0;i<nums.length;i++){
         int j=i+1;
          if(nums.length/3<count && !(li.contains(nums[i]))){
            li.add(nums[i]);
          }
          if(j!=nums.length && nums[i]==nums[j]){
            count++;
          }
          else{
            count=1;
          }
        }

        

        return li;
    }
}
