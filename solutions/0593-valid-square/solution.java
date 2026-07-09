class Solution {
    public int d(int p1[], int p2[]) {
        return(int) (Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
       int []arr=new int [6];
       arr[0]=d(p1,p2);
       arr[1]=d(p1,p3);
       arr[2]=d(p1,p4);
       arr[3]=d(p2,p3);
       arr[4]=d(p2,p4);
       arr[5]=d(p3,p4);
       Arrays.sort(arr);
       if(arr[0]==0) return false;
       if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[5]==arr[4] && arr[4]==arr[3]+arr[2]){
        return true;
       }
       return false;

    }

}

