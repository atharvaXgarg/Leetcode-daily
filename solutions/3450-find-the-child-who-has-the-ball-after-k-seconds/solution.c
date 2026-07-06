int numberOfChild(int n, int k) {
     int child=0,d=1;
        for(int i=0;i<k;i++){
            child+=d;
            if(child==0){
                d=1;
            }
            else if (child==n-1){
                d=-1;
            }
        }
       return child;
}
