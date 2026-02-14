class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> li=new ArrayList<>();
        int a=0;
        for(int i=nums[0] ; i<nums[nums.length-1]; i++){
            if(nums[a]!=i){ li.add(i); continue;}
                a++;
            
        }
        return li;
    }
}
