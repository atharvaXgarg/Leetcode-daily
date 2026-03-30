class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {
                int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.size();i++){
           if(nums[i]<min){
            min=nums[i];
           }
           if(nums[i]>max){
            max=nums[i];
           }
        }
        int k=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=max && nums[i]!=min){
                k=nums[i]; break;
            }
        } return k;
    }
};
