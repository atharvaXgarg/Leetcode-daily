class Solution {
    public boolean asteroidsDestroyed(long mass, int[] ast) {
        boolean b=true;
        Arrays.sort(ast);
        for(int i=0;i<ast.length;i++){
            if(mass>=ast[i]){
              mass+=ast[i];
            }
            else{
                b=false;
                break;
            }
        }
        return b;
    }
}
