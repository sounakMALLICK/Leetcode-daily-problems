class Solution {
    public int maxDifference(String s) {
        int arr[] = new int[26];
        int maxOdd = 0;
        int maxEven = 0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]%2==0 && maxEven<arr[i]){
                maxEven = arr[i];
            }
            else if(arr[i]%2!=0 && maxOdd<arr[i]){
                maxOdd = arr[i];
            }
        }
        return maxOdd - maxEven;
    }
}