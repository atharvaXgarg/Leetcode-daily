class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
             bl.add(i);
        }
        for(int i=0; i<nums.length; i++){
            bl.set(nums[i]-1,0);
        }
         for(int i=0; i<nums.length; i++){
            if(bl.get(i)!=0){
                al.add(bl.get(i));
            }
        }

        return al;
    }

}
