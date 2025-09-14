class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i),0)+1);
        }

        HashMap<Character,Integer> m = new HashMap<>();
        int matchCount = 0;
        for(int i=0; i<p.length(); i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i),0)+1);
            if(m.get(s.charAt(i))<=map.getOrDefault(s.charAt(i),0)){
                matchCount++;
            }
        }
        if(matchCount==p.length()){
            ans.add(0);
        }
        int sp = 0;
        int ep = p.length();
        while(ep<s.length()){
            m.put(s.charAt(ep), m.getOrDefault(s.charAt(ep), 0)+1);
            if(m.get(s.charAt(ep))<=map.getOrDefault(s.charAt(ep),0)){
                matchCount++;
            }
            m.put(s.charAt(sp), m.get(s.charAt(sp))-1);
            if(m.get(s.charAt(sp))<map.getOrDefault(s.charAt(sp),0)){
                matchCount--;
            }
            sp++;
            ep++;
            if(matchCount==p.length()){
                ans.add(sp);
            }
        }
        return ans;
    }
}