// Last updated: 08/09/2026, 10:13:21
class Solution {
    public int minimumMoves(String s) {
        int moves=0;
        for(int i =0;i<s.length();i++){
            if (s.charAt(i)=='X'){
                moves++;
                i+=2;
            }
        }
        return moves;
    }
}