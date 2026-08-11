// Last updated: 11/08/2026, 14:18:30
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i :nums)
        {
        if (pq.size()<k)    
        pq.add(i);
        
        else if(i > pq.peek()){
        pq.poll();
        pq.add(i);
        }
     }
     return pq.peek();
   }
}