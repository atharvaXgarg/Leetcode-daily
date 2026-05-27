class Solution {
    public int[] decimalRepresentation(int l) {
        ArrayList <Integer> li=new ArrayList<>();
    int n=l;
        int count=0;
        while(l!=0){
            count++;
        l/=10;
        }
       
    int k= (int)Math.pow(10,count-1);
     System.out.print(k+" ");
      while(k>=1){
        int j=n-n%k;
          
        if(j!=0){
           
            li.add(j);
        }
        n=n%k;
        k/=10;
      } 
      int[] arr=new int[li.size()];
      for(int i=0;i<arr.length;i++){
        arr[i]=li.get(i);
      }
      return arr;
    }
}
