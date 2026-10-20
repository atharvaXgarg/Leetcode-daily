class Solution {
      public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public boolean isGoodArray(int[] nums) {
        int k=1;
        int result=nums[0];
       for(int i=1;i<nums.length;i++){
          result=gcd(result,nums[i]);
       }
       return result==1;
    }
}