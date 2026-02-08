class Solution {
    public int[] constructRectangle(int area) {
        int k =(int)Math.sqrt(area);int a; 
        for( a=k; a>=1; a--){
            if(area%a==0) break;
        }
        int []arr=new int[2];
        arr[1]=a;
        arr[0]=(area/a); 
        return arr;
        
    }
}
