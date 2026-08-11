// Last updated: 11/08/2026, 14:14:05
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for (int i = left;i<=right;i++){
            char first=words[i].charAt(0);
            char last =words[i].charAt(words[i].length()-1);
            if(isVowel(first,last))
            count++;
        }
        return count;
       
    }
     boolean isVowel(char a,char b){
            if ((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')&&(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'))

            return true;

            else 
            return false;
        }
}