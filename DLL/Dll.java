package DLL;
public class Dll {
    Node head;
    public void add(int value){
        Node node = new Node(value);
        if(this.head==null){
            this.head = node;
        }
        else{
            Node cur = this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next= node;
            node.prev=cur;
        }
    }
    public void print(){
        Node cur = this.head;
        if(this.head==null){
            System.out.println("Empty List");
            return;
        }
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}
