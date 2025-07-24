class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int indegree[] = new int[numCourses];
        for(int i=0; i<prerequisites.length; i++){
            int start = prerequisites[i][1];
            int end = prerequisites[i][0];
            indegree[end]++;
            if(!map.containsKey(start)){
                map.put(start, new ArrayList<>());
            }
            map.get(start).add(end);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int rem = q.remove();
            count++;
            if(map.containsKey(rem)){
                for(int v : map.get(rem)){
                    indegree[v]--;
                    if(indegree[v]==0){
                        q.add(v);
                    }
                }
            }
        }
        return (count==numCourses);
    }
}