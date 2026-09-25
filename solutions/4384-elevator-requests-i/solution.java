class Solution {
    public int elevatorRequests(int n, int[] req) {
        int sum=req[0];
        for(int i=1;i<req.length;i++){
            sum+=Math.abs(req[i]-req[i-1]);
        }
        return sum;
    }
}
