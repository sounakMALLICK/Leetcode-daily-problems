class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(list.contains(n*2) || (n%2==0 && list.contains(n/2))){
                return true;
            }
            else{
                list.add(n);
            }
        }
        return false;
    }
}