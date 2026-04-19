class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){max=nums[i];}
            if(min>nums[i]){min=nums[i];}
        }
        int k=max%min;
        while(k!=0){
        max=min;
        min=k;
        k=max%min;
        }
        return min;
        
    }
}
