class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
        if(nums.length<3)return false;
        else { int max=0,count=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]%2!=0){
                    count++;
                    if(count>max){ max=count; if(max==3)return true;}
                }
                else { count=0;}
               
            }  return false;
        }
    }
}
