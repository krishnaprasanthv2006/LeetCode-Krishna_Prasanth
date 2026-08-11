// Last updated: 11/08/2026, 14:13:12
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        ArrayList<Integer>[] children = new ArrayList [n];
        for (int i = 0;i<n;i++)
            children[i] = new ArrayList<>();

        for (int i=1;i<n;i++)
            children[parent[i]].add(i);

        int [] depth = new int [n];
        Queue <Integer> q = new LinkedList<>();

        depth[0] =1;
        q.add (0);

        int height = 1;

        while(!q.isEmpty()){
            int node = q.poll();
            for (int child : children[node] ){
                depth[child]=depth[node]+1;
                height = Math.max(height,depth[child]);
                q.add(child);
            }
        }
        long sum = 0;

        for (int i =0 ;i<n;i++){
            sum+=(long) nums[i]*(height - depth[i] + 1);
        }
        return sum;
    }
}