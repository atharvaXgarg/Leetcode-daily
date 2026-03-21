class Solution {
    public int maximum69Number (int num) {
      int k=(int)Math.log10(num);
      int arr[]=new int[k+1];
      for(int i=arr.length-1;i>=0; i--){
        arr[i]=num%10;
        num/=10;
      }
      for(int i=0; i<arr.length;i++){
        if(arr[i]==6){
            arr[i]=9; break;
        }
      }
      int j=0;
      for(int i=0;i<arr.length;i++){
        j=j*10+arr[i];
      }
      return j;

    }
}
