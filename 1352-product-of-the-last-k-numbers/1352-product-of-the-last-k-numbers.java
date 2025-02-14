class ProductOfNumbers {
    List<Integer> list;
    int i;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        list.add(1);
        i = 0;
    }
    
    public void add(int num) {
        if(num==0){
            list = new ArrayList<>();
            i = 0;
            list.add(1);
        }
        else{
            list.add(num * list.get(i));
            i++;
        }
    }
    
    public int getProduct(int k) {
        if(k>i){
            return 0;
        }
        else{
            return list.get(i)/list.get(i-k);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */