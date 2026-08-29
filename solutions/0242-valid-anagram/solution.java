class Solution {
    public boolean isAnagram(String s, String t) {
        /// method 1 using arrays .
        /// method 2 using HashMap 
    //     if (s.length() != t.length()) {
    //     return false;
    // }
    
    // char[] sArray = s.toCharArray();
    // char[] tArray = t.toCharArray();
    
    // Arrays.sort(sArray);
    // Arrays.sort(tArray);
    // return Arrays.equals(sArray, tArray);

    // HashMap<Character,Integer> hm1=new HashMap<>();
    // HashMap<Character,Integer> hm2=new HashMap<>();
    //  if( s.length()!=t.length()){
    //     return false;
    //  }
    //  for(int i=0;i<s.length();i++){
    //     hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
    //     hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i),0)+1);
    //  }
     
    //  return hm1.equals(hm2);
    if( s.length()!=t.length()){
        return false;
     }
     int[] arr1=new int[26];
     int[] arr2=new int[26];
     for(int i=0;i<s.length();i++){
        arr1[(int)s.charAt(i)-97]++;
        arr2[(int)t.charAt(i)-97]++;
     }
     for(int i=0;i<26;i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
     }
     return true;

    

    }
}
