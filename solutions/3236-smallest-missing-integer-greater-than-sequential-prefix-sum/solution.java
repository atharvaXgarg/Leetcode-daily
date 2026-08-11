class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                sum+=nums[i];
            }
            else { break;}
        }
        // System.out.print(sum);
        // now find the element 
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=sum && !(al.contains(nums[i]-sum))){
                al.add(nums[i]-sum);
            }
        }
        if(al.size()==0) return sum;
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            if(al.get(i)!=i){
                return sum+i;
            }
        }
        return sum+al.size();

        

    }
}
