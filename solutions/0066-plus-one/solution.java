class Solution {
    public int[] plusOne(int[] di) {
        int carry=(di[di.length-1]+1-(di[di.length-1]+1)%10)/10;
        if(carry==0){
            di[di.length-1]=di[di.length-1]+1;
            return di;
        }
        else{
            ArrayList <Integer> al=new ArrayList<>();
            for(int i=di.length-1;i>=0;i--){
                int sum=(di[i]+carry)%10;
                al.add(sum);
                carry=(di[i]+carry-(di[i]+carry)%10)/10;
            }
            if(carry==1){
                al.add(1);
            }
            int[] arr=new int[al.size()];
            for(int i=0;i<al.size();i++){
              arr[i]=al.get(al.size()-1-i);
            }return arr;
        }
        

        
    }
}
