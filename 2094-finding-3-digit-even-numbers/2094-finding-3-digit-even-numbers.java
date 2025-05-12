class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<digits.length; i++){
            map.put(digits[i], map.getOrDefault(digits[i],0)+1);
        }
        for(int i=0; i<=9; i++){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
        }
        for(int i=100; i<=998; i+=2){
            int arr[] = new int[10];
            int n = i;
            int n1 = n%10;
            n/=10;
            int n2 = n%10;
            n/=10;
            int n3 = n;

            arr[n1]++;
            arr[n2]++;
            arr[n3]++;

            boolean flag = true;
            for(int j=0; j<=9; j++){
                if(map.containsKey(j) && arr[j]>map.get(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}