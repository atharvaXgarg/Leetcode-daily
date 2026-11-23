class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
        al=new ArrayList<>();
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int a=1;
        for(int i=al.size()-k;i<al.size();i++){
           a*=al.get(i);
        }
        return a;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
