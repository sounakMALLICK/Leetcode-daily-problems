class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        char arr[] = s.toCharArray();
        int temp[] = new int[n+1];
        for(int i=0; i<shifts.length; i++){
            if(shifts[i][2]==0){
                temp[shifts[i][0]]--;
                temp[shifts[i][1]+1]++;
            }
            else{
                temp[shifts[i][0]]++;
                temp[shifts[i][1]+1]--;
            }
        }

        int pref[] = new int[n];
        pref[0] = temp[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]+temp[i];
        }

        for(int i=0; i<n; i++){
            int val = arr[i]-'a';
            val += pref[i];
            val %= 26;
            if(val<0){
                val += 26;
            }
            arr[i] = (char)(val+'a');
        }
        return String.valueOf(arr);
    }
}