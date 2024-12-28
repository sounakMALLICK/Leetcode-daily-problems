class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=heights.length; i++){
            int temp = 0;
            if(i != heights.length){
                temp = heights[i];
            }
            while(stack.size()>0 && temp<heights[stack.peek()]){
                int toBeSolved = stack.pop();

                int nsr = i;
                int x1 = nsr-1;

                int nsl = -1;
                if(stack.size()>0){
                    nsl = stack.peek();
                }
                int x2 = nsl+1;

                int area = heights[toBeSolved]*(x1-x2+1);
                ans = Math.max(ans, area);
            }
            stack.push(i);
        }
        return ans;
    }
}