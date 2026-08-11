// Last updated: 11/08/2026, 14:16:26
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<double[]> pq =
                new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            pq.offer(new double[]{
                    (double) arr[i] / arr[n - 1],
                    i,
                    n - 1
            });
        }

        while (--k > 0) {
            double[] cur = pq.poll();

            int i = (int) cur[1];
            int j = (int) cur[2];

            if (j - 1 > i) {
                pq.offer(new double[]{
                        (double) arr[i] / arr[j - 1],
                        i,
                        j - 1
                });
            }
        }

        double[] ans = pq.poll();

        return new int[]{
                arr[(int) ans[1]],
                arr[(int) ans[2]]
        };
    }
}