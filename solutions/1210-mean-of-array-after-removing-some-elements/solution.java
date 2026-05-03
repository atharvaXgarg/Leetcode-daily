class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int x=(int)(arr.length*0.05);
        System.out.print(x);
        int sum=0;
        for(int i=x;i<arr.length-x;i++){
               sum+=arr[i];
        } 
        double d=sum/(arr.length-2.0*x);
        return d;
    }
}
