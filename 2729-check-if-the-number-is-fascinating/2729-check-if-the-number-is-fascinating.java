class Solution {
    public boolean isFascinating(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n1 = 2*n;
        int n2 = 3*n;

        // for the value of n..
        while(n!=0){
            if(!map.containsKey(n%10)){
                map.put(n%10, 1);
            }
            else{
                map.put(n%10, map.get(n%10)+1);
            }
            n /= 10;
        }

        //for the value of 2*n...
        while(n1!=0){
            if(!map.containsKey(n1%10)){
                map.put(n1%10, 1);
            }
            else{
                map.put(n1%10, map.get(n1%10)+1);
            }
            n1 /= 10;
        }

        //for the value of 3*n...
        while(n2!=0){
            if(!map.containsKey(n2%10)){
                map.put(n2%10, 1);
            }
            else{
                map.put(n2%10, map.get(n2%10)+1);
            }
            n2 /= 10;
        }

        boolean ans = true;
        for(int i=1; i<=9; i++){
            if(map.containsKey(i) && map.get(i)==1){
                ans = true;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
}