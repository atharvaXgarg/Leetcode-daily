class Solution {
public:
    bool increasing(vector<int>& nums){
        if(nums[0]>nums[1]) return false;
        else {
            for(int i=0; i<nums.size()-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
        }
        return true;
    }
    bool decreasing(vector<int>& nums){
        if(nums[0]<nums[1]) return false;
        else {
            for(int i=0; i<nums.size()-1;i++){
                if(nums[i]<nums[i+1]) return false;
            }
        }
        return true;
    }



    bool isMonotonic(vector<int>& nums) {
        if(nums.size()==1)return true;
        return  (increasing(nums) || decreasing(nums));
    }
};
