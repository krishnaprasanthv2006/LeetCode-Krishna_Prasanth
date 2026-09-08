// Last updated: 08/09/2026, 10:11:37
class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int equalPairs = 0;
        for (int i = 0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                equalPairs++;
            }
        }
        int answer=0;
        for (int i = 0;i<n;i++){
            int removedPair = 0;
            if (s.charAt(i)==s.charAt((i+1)%n)){
                removedPair = 1;
            }
            if(equalPairs - removedPair == k){
                answer++;
            }
        }
        return answer;
    }
}