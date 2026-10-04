class Solution {
    public int calPoints(String[] op) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("C")){
                al.remove(al.size()-1);
            }
            else if(op[i].equals("D")){
                al.add(al.get(al.size()-1)*2);
            }
            else if(op[i].equals("+")){
                al.add(al.get(al.size()-1)+al.get(al.size()-2));
            }
            else{
                al.add(Integer.parseInt(op[i]));
            }
        }
        int sum=0;
        for(int i=0;i<al.size();i++){
           sum+=al.get(i);
        }
        return sum;
    }
}
