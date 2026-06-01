class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    HashMap<Integer,Integer>hm=new HashMap<>();
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=0;i<bulbs.size();i++){
        hm.put(bulbs.get(i),hm.getOrDefault(bulbs.get(i),0)+1);
    }
    for(int i=0;i<bulbs.size();i++){
        if(hm.get(bulbs.get(i))%2!=0 && (!(al.contains(bulbs.get(i))))){
            al.add(bulbs.get(i));
        }
    } Collections.sort(al);
     return al;
            
        
    }
}
