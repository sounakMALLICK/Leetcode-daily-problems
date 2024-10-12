class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char slow = keysPressed.charAt(0);
        for(int i=1; i<releaseTimes.length; i++){
            if(max<(releaseTimes[i]-releaseTimes[i-1]) || (max==(releaseTimes[i]-releaseTimes[i-1]) && keysPressed.charAt(i)>slow)){
                max = releaseTimes[i]-releaseTimes[i-1];
                slow = keysPressed.charAt(i);
            }
        }
        return slow;
    }
}