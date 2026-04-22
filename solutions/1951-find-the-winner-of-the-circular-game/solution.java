class Solution {
    public int findTheWinner(int n, int k) {
       ArrayList<Integer> al =new ArrayList<>();
       for(int i=1;i<=n;i++){
        al.add(i);
       }
       int prev=0;
       while(al.size()!=1){
        int i=(prev+k-1)%al.size();
        prev=i;
        al.remove(i);
       }
     
       return al.get(0);
    }
}
