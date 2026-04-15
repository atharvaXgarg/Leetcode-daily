class Solution {
    public int closestTarget(String[] words, String target, int start) {
        boolean exist = false;
        int j = start;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < words.length; i++) {
           if(j<0){ j=words.length-1;}
            if (words[j].equals(target)) {
                exist = true;
                break;
            }
            j--;
            count++;
        } if (!exist){
            return -1;}
        
        int k = start;
        for (int i = 0; i < words.length; i++) {
            k = k % words.length;
            if (words[k].equals(target)) {
                break;
            }

            count2++;
            k++;
        }
         
        if ((count) <(count2))
            return (count);
        return (count2);

    }
}
