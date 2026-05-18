class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<=n/2+1;i++){
            if(n%i==0 ){
                li.add(i);
            }
        }
        li.add(n);

        if(k>li.size()){
            return -1;
        }
        return li.get(k-1);
    }
}
