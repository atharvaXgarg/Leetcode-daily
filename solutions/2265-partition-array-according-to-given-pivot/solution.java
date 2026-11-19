class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     ArrayList <Integer> small=new ArrayList<>();
     ArrayList <Integer> great=new ArrayList<>();
     int count=0;
     for(int i=0;i<nums.length;i++){
        if(pivot>nums[i]){
            small.add(nums[i]);
        }else if(pivot<nums[i]){
            great.add(nums[i]);
        }else{
            count++;
        }
     }
     for(int i=0;i<count;i++){
        small.add(pivot);
     }
     small.addAll(great);
     for(int i=0;i<nums.length;i++){
        nums[i]=small.get(i);
     }
         return nums;
       
    }
}
