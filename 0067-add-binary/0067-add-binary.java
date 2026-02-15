class Solution {
    public String addBinary(String a, String b) {
        int n1 = 0;
        int j=0;
        for(int i=a.length()-1; i>=0; i--){
            if(a.charAt(i)=='1'){
                n1 += (1<<j);
            }
            j++;
        }

        int n2 = 0;
        int k=0;
        for(int i=b.length()-1; i>=0; i--){
            if(b.charAt(i)=='1'){
                n2 += (1<<k);
            }
            k++;
        }
        if(n1+n2<0){
            return Integer.toBinaryString(Math.abs(n1+n2+1));
        }
        return Integer.toBinaryString(n1+n2);
    }
}