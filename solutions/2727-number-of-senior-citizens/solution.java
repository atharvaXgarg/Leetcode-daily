class Solution {
    public int countSeniors(String[] det) {
        int res=0;
        for(int i=0;i<det.length;i++){
            int age=(det[i].charAt(11)-48)*10+(det[i].charAt(12)-48);
            if(age>60){
                res++;
            }
        }
        return res;
    }
}
