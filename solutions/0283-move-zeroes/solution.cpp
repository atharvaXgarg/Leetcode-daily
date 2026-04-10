class Solution {
public:
    void moveZeroes(vector<int>& arr) {
          int j=0,count=0;
        for(int i=0; i<arr.size(); i++){
            if(arr[i]==0) {
                count++;
           }
           else arr[j++]=arr[i];
        }
        for(int i=arr.size()-count; i<arr.size(); i++){
            arr[i]=0;
        }
    }
};
