// Last updated: 19/09/2026, 23:03:52
1class LRUCache {
2
3    class Node {
4        int key, value;
5        Node prev, next;
6
7        Node(int key, int value) {
8            this.key = key;
9            this.value = value;
10        }
11    }
12
13    int capacity;
14    HashMap<Integer, Node> map;
15    Node head, tail;
16
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19        map = new HashMap<>();
20
21        head = new Node(0, 0);
22        tail = new Node(0, 0);
23
24        head.next = tail;
25        tail.prev = head;
26    }
27
28    public int get(int key) {
29        if (!map.containsKey(key))
30            return -1;
31
32        Node node = map.get(key);
33        remove(node);
34        insert(node);
35
36        return node.value;
37    }
38
39    public void put(int key, int value) {
40        if (map.containsKey(key)) {
41            remove(map.get(key));
42        }
43
44        Node node = new Node(key, value);
45        map.put(key, node);
46        insert(node);
47
48        if (map.size() > capacity) {
49            Node lru = head.next;
50            remove(lru);
51            map.remove(lru.key);
52        }
53    }
54
55    private void remove(Node node) {
56        node.prev.next = node.next;
57        node.next.prev = node.prev;
58    }
59
60    private void insert(Node node) {
61        node.next = tail;
62        node.prev = tail.prev;
63
64        tail.prev.next = node;
65        tail.prev = node;
66    }
67}