class Solution {
    public int[] intersect(int[] num1, int[] num2) {
       Arrays.sort(num1); 
       Arrays.sort(num2); 
       ArrayList<Integer> al =new ArrayList<>();
       // using 2 ptr approach
       int i=0,j=0;
       while(i<num1.length && j<num2.length){
        if(num1[i]==num2[j]){
            al.add(num1[i]); i++;j++;
        }
        else if(num1[i]>num2[j]){
            j++;
        }
        else{
            i++;
        }
       }
       int []arr=new int[al.size()];
       for(int k=0;k<al.size();k++){
        arr[k]=al.get(k);
       }
       return arr;
          
    }
}
