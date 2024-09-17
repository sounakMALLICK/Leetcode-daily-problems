class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        int i=0;
        while(i<n){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
                i++;
            }
            else{
                if(stack.size()==0 || stack.peek()<0){
                    stack.push(asteroids[i]);
                     i++;
                }
                else if(Math.abs(asteroids[i])>stack.peek()){
                    stack.pop();
                }
                else if(Math.abs(asteroids[i])<stack.peek()){
                    i++;
                }
                else{
                    stack.pop();
                    i++;
                }
            }
        }
        int arr[] = new int[stack.size()];
        for(int j=arr.length-1; j>=0; j--){
            arr[j] = stack.pop();
        }
        return arr;
    }
}