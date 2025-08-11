class Solution {
    public String getSortedString(String str){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public boolean reorderedPowerOf2(int n) {
        String num = Integer.toString(n);
        num = getSortedString(num);
        for(int i=1; i<=1_000_000_000; i*=2){
            String s = Integer.toString(i);
            if(num.equals(getSortedString(s))){
                return true;
            }
        }
        return false;
    }
}