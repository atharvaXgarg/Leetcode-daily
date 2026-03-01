class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer>al=new ArrayList<>();
         n=(int)Math.pow(2,n);
         int []arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=i;
        }
        for(int i=0; i<n; i++){
            int a=arr[i];
            int b=arr[i]>>1;
            al.add(a^b);
        } return al;
    }
}
