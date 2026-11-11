class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        // We want unique codes
        HashSet <String> hs=new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(arr[(int) words[i].charAt(j) - 97]);
            }
             hs.add(sb.toString());
        }
        return hs.size();
        

    }
}
