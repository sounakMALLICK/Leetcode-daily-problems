class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i=0; 
        int j=s.length()-1;
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])){
                swap(arr, i, j);
                i++;
                j--;
            }
            else if(!(isVowel(arr[i]))){
                i++;
            }
            else{
                j--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public void swap(char arr[], int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}