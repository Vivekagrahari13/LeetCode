class Node {
    int key,value;
    Node prev,next;
    public Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}

class LRUCache {
    private HashMap<Integer, Node> map;
    private int capacity, count;
    private Node head, tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
        count=0;
    }

    public void addHead(Node node)
    {
        node.next = head.next; 
		node.next.prev = node; 
		node.prev = head; 
		head.next = node; 
    }
    public void delNode(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public int get(int key) {
        if(map.get(key)!=null){
            Node node=map.get(key);
            int res=node.value;
            delNode(node);
            addHead(node);
            
            return res;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.get(key)!=null)
        {
            Node node=map.get(key);
            node.value=value;
            delNode(node);
            addHead(node);
        }
        else
        {
            Node node=new Node(key,value);
            map.put(key,node);
            if(count<capacity)
            {
                count++;
                addHead(node);
            }
            else{
                map.remove(tail.prev.key);
                delNode(tail.prev);
                addHead(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */