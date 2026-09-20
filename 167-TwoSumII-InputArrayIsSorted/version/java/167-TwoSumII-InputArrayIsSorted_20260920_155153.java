// Last updated: 20/09/2026, 15:51:53
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3       int p1 = 0,p2= numbers.length-1;
4       int arr[]=new int[2];
5       while (p1 < p2){
6        if (numbers[p1] + numbers[p2] == target){
7            arr[0]=p1+1;
8            arr[1]=p2+1;
9            break;
10        }
11
12        else if (numbers[p1] + numbers[p2]>target)
13        p2--;
14
15        else if (numbers[p1] + numbers[p2]<target)
16        p1++;
17       }
18       return arr;
19    }
20}