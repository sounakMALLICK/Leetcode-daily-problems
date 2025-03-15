class Node{
    int key=0, value=0;
    Node prev=null;
    Node next=null;
    Node(){}
}

class LRUCache {

    HashMap<Integer, Node> map;
    Node head = new Node();
    Node tail = new Node();
    int size;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        size = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int ans = map.get(key).value;
            Node del = delete(head, map.get(key));
            add(head, tail, del);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node temp = map.get(key);
        if(temp==null){
            //new key which is not present
            if(size==map.size()){
                map.remove(head.next.key);
                delete(head, head.next);
            }
            Node n = new Node();
            n.key = key;
            n.value = value;
            map.put(key, n);
            add(head, tail, n);
        }
        else{
            //the key is already present
            Node d = delete(head, temp);
            d.value = value;
            add(head, tail, d);
        }
    }

    public Node delete(Node head, Node del){
        Node delm1 = del.prev;
        Node delp1 = del.next;

        delm1.next = delp1;
        delp1.prev = delm1;

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