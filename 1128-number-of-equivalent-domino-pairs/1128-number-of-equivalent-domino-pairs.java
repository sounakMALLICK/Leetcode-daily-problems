class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<dominoes.length; i++){
            int num = dominoes[i][0] < dominoes[i][1] ? dominoes[i][0]*10 + dominoes[i][1] : dominoes[i][1]*10 + dominoes[i][0];
            if(map.containsKey(num)){
                count += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return count;
    }
}