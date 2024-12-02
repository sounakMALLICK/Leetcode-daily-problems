class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        char arr[] = sentence.toCharArray();
        int c=1;
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' '){
                if(j>0){
                    j=0;
                }
                c++;
            }
            else if(arr[i]==searchWord.charAt(j)){
                if(j==0 && i!=0 && arr[i-1]==' '){
                    j++;
                }
                else if(j!=0 ){
                    j++;
                }
                else if(i==0){
                    j++;
                }
            }
            else{
                j=0;
            }
            if(j==searchWord.length()){
                return c;
            }
        }
        return -1;
    }
}