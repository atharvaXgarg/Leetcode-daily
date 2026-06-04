class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        int re=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && max<hm.get(nums[i])){
                max=hm.get(nums[i]);
                re=nums[i];
            }
        }
        return re;
    }
}
