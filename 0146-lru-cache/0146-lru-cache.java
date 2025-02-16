class Node{
        int key=0, value=0;
        Node next = null;
        Node prev = null;
        Node(){}
    }
class LRUCache {
    HashMap<Integer, Node> map;
    int size;
    Node head = new Node();
    Node tail = new Node();

    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int ans = map.get(key).value;
            Node temp = delete(head, map.get(key));
            add(head, tail, temp);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node res = map.get(key);
        if(res==null){
            if(map.size()==size){
                map.remove(head.next.key);
                delete(head, head.next);
            }
            Node n1 = new Node();
            n1.key = key;
            n1.value = value;
            map.put(key, n1);
            add(head, tail, n1);
        }
        else{
            Node temp = delete(head, res);
            temp.value = value;
            add(head,tail,temp);
        }
    }
    public Node delete(Node head, Node del){
        Node dm1 = del.prev;
        Node dp1 = del.next;

        dm1.next = dp1;
        dp1.prev = dm1;

        del.next = null;
        del.prev = null;

        return del;
        
    }
    public void add(Node head, Node tail, Node n){
        Node tm1 = tail.prev;

        tm1.next = n;
        n.next = tail;
        
        tail.prev = n;
        n.prev = tm1;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */