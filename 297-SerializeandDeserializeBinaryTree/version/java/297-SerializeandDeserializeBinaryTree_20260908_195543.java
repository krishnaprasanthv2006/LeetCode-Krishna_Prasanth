// Last updated: 08/09/2026, 19:55:43
1import java.util.*;
2
3public class Codec {
4
5    public String serialize(TreeNode root) {
6        if (root == null) {
7            return "";
8        }
9
10        StringBuilder result = new StringBuilder();
11        Queue<TreeNode> queue = new LinkedList<>();
12        queue.offer(root);
13
14        while (!queue.isEmpty()) {
15            TreeNode node = queue.poll();
16
17            if (node == null) {
18                result.append("null,");
19            } else {
20                result.append(node.val).append(",");
21                queue.offer(node.left);
22                queue.offer(node.right);
23            }
24        }
25
26        return result.toString();
27    }
28
29    public TreeNode deserialize(String data) {
30        if (data == null || data.isEmpty()) {
31            return null;
32        }
33
34        String[] values = data.split(",");
35        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
36        Queue<TreeNode> queue = new LinkedList<>();
37        queue.offer(root);
38
39        int i = 1;
40
41        while (!queue.isEmpty() && i < values.length) {
42            TreeNode node = queue.poll();
43
44            if (!values[i].equals("null")) {
45                node.left = new TreeNode(Integer.parseInt(values[i]));
46                queue.offer(node.left);
47            }
48            i++;
49
50            if (i < values.length && !values[i].equals("null")) {
51                node.right = new TreeNode(Integer.parseInt(values[i]));
52                queue.offer(node.right);
53            }
54            i++;
55        }
56
57        return root;
58    }
59}