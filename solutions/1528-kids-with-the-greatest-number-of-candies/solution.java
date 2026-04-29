class Solution {
    public List<Boolean> kidsWithCandies(int[] ca, int ex) {
       int m=ca[0];
       for(int i=1;i<ca.length;i++){
        if(m<ca[i]){
            m=ca[i];
        }
       }
       ArrayList <Boolean> al=new ArrayList<>();
       for(int i=0;i<ca.length;i++){
          if((ca[i]+ex)<m){
            al.add(false);
          }
          else{
            al.add(true);
          }
       } return al;
    }
}
