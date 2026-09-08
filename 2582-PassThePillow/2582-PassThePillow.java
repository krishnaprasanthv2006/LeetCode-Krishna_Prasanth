// Last updated: 08/09/2026, 10:13:01
class Solution {
    public int passThePillow(int n, int time) {
         int cycle=time/(n-1);
         int rs =time%(n-1);
         return cycle % 2 == 0 ? rs+1:n-rs;

        }
    }
