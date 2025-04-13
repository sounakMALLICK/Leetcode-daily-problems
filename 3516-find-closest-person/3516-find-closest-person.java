class Solution {
    public int findClosest(int x, int y, int z) {
        int xtz = Math.abs(x-z);
        int ytz = Math.abs(y-z);
        if(xtz>ytz){
            return 2;
        }
        else if(xtz<ytz){
            return 1;
        }
        return 0;
    }
}