class Solution {
    public int splitNum(int num) {
        String s11=String.valueOf(num);
        char[] ch=s11.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        /// write method for num1 and num2
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                sb1.append(ch[i]);
            }else{
                sb2.append(ch[i]);
            }
        }
        String s1=sb1.toString();
        String s2=sb2.toString();
        
        int num1=Integer.valueOf(s1);
        int num2=Integer.valueOf(s2);
        return num1+num2;
    }
}