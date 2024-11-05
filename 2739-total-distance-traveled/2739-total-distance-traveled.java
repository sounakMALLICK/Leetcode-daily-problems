class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        while(mainTank >= 5 && additionalTank > 0){
            ans += 50;
            mainTank = (mainTank-5)+1;
            additionalTank--;
        }
        ans += (mainTank*10);
        return ans;
    }
}