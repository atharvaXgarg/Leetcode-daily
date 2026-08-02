class Solution {
    public String restoreString(String s, int[] in) {
        
        char[] result = new char[s.length()];
        
        // Directly place each character at its target index
        for(int i = 0; i < in.length; i++) {
            result[in[i]] = s.charAt(i);
        }
        
        // Convert the character array back to a string
        return new String(result);
    }
}
