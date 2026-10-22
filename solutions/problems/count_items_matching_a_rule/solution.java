class Solution {
    public int countMatches(List<List<String>> items, String Key, String value) {
        int i;
        if(Key.equals("type")){
          i=0;
        }
        else if(Key.equals("color")){
          i=1;
        }
        else{
             i=2;
        }
        int s=0;
        for(int k=0;k<items.size();k++){
            if((items.get(k).get(i)).equals(value)){
                s+=1;
            }
        }
        return s;
    }
}