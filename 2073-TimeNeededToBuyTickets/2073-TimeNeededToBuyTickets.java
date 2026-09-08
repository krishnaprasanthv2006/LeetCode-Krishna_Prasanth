// Last updated: 08/09/2026, 10:13:19
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue <Integer> q = new LinkedList<>();
       for(int i=0;i<tickets.length;i++)
       q.add(i);
     
     int t = 0;
     while(!q.isEmpty()){
        int ind =q.poll();
        t++;
        tickets[ind]--;
        if(tickets[ind]>0)
        q.add(ind);
        if(ind==k && tickets[ind]==0)
        return t;
     }
      return t;
}
    
}