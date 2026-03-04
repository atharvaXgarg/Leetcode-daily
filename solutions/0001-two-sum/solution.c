/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
   * returnSize=2;
    int* arr=(int*)calloc(2,sizeof(int));
    for(int i=0; i<numsSize-1; i++){
        for(int j=i+1; j<numsSize; j++){
            if(target==nums[i]+nums[j]){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
        }
 
    } return arr;
}
