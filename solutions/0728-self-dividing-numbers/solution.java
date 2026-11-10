class Solution {
   
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int k=left;k<=right;k++){
            int i=k;// making copy
            boolean isSelf=true;
            while(i!=0){
                int x=i%10;
                if(x==0 || k%x!=0 ){
                    isSelf=false;
                    break; 
                }
                i/=10;
            } if(isSelf){
                al.add(k);
            }
        }
        return al;
        
    }
}
