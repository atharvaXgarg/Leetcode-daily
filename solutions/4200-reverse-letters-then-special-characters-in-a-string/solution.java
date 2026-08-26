class Solution {
    public String reverseByType(String s) {
        // ye code ko apan O(log(n)) tk reduce kr skte hai avg case mai 2 ptr approach use krke
        ArrayList<Character> al1=new ArrayList<>();
        ArrayList<Character> al2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if((int)t>=97 && (int) t<=122){
                al1.add(t);
            }
            else{
                al2.add(t);
            }
        }
        Collections.reverse(al1);
        Collections.reverse(al2);
        StringBuffer sb=new StringBuffer("");
        int j=0,k=0;
        for(int i=0;i<s.length();i++){
              char t=s.charAt(i);
            if((int)t>=97 && (int) t<=122){
                sb.append(al1.get(j));
                j++;
            }
            else{
                sb.append(al2.get(k));
                k++;
            }
        }
        return sb.toString();
    }
}
