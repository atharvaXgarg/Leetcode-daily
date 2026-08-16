class Solution {
    public String removeStars(String s) {
        ArrayList<Character> al=new ArrayList<>(); 
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!='*'){
              al.add(s.charAt(i));
           }
           else{
                al.remove(al.size()-1);
                // ye isliye kiya kyuki i nhi rakh skte 
                //for instance agar i=7 aur 6 char hai hi nhi list mai
           }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<al.size();i++){
            sb.append(al.get(i));
        }
        return sb.toString();
    }
}
