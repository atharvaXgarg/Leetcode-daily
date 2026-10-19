class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Approach 1 O(n log n)
        // sort the array and return index
        // approach 2
        ArrayList<Integer> al=new ArrayList<>();
        int prevElements=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                prevElements++;
            }
            else if(nums[i]==target){
                count++;
            }
        }
        if(count==0){return al;}
        while(count!=0){
            al.add(prevElements);
            prevElements++;
            count--;
        }
        return al;
       
       
    }
}