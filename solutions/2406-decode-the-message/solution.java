class Solution {
    public String decodeMessage(String key, String message) {
      key =key.replaceAll(" ","");
      int[]arr=new int[26];
      // Mapping the String 
      int j=0;
      for(int i=0;i<key.length();i++){
           if(arr[key.charAt(i)-97]!=0){
            continue;
           }
           else{
            arr[(int)key.charAt(i)-97]=j+97;
            j++;
           }
      }
      //  Now Decoding Message
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<message.length();i++){
        if(message.charAt(i)==' '){
            sb.append(' ');
        }else{
            sb.append((char)arr[message.charAt(i)-97]);
        }
      }
      return sb.toString();
    }
}
