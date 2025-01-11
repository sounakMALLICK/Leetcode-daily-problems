class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(k>n){
            return false;
        }
        else if(k==n){
            return true;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(map.get(s.charAt(i))%2==1){
                count++;
                map.put(s.charAt(i),0);
            }
        }
        return (count<=k);
    }
}