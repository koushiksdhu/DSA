public class LL {
    
    private Node head, tail;
    public int size;

    public LL(){            // Constructor
        this.size = 0;
    }

    public void insertFirst(int val){       // Inserting at first index.
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(this.tail == null){
            this.tail = head;
        }
        this.size++;
    }

    public void insertLast(int val){        // Inserting at last index.
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        this.size++;       
    }

    public void insertAtPos(int idx, int val){      // Inserting at a particular position.
        if(idx == 0){
            insertFirst(val);
            this.size++;
            return;
        }
        else if(idx >= this.size+1){
            insertLast(val);
            this.size++;
            return;
        }
        int i = 0;
        Node temp = head;
        Node newNode = new Node(val);
        while(temp != null){
            if(i == idx-1){
                newNode.next = temp.next;
                temp.next = newNode;
                this.size++;
                return;
            }
            temp = temp.next;
            i++;
        }
        this.size++;
    }

    public int deleteFirst(){               // Delete first element from the linked list.
        if(head == null){
            tail = null;
        }
        int val = head.value;
        head = head.next;
        this.size--;
        return val;
    }

    public int deleteLast(){                // Delete last element from the linked list.
        Node t = head;
        if(t.next == null){
            int val = t.value;
            t = null;
            this.size--;
            return val;
        }
        while(t.next.next != null){
            t = t.next;
        }
        int val = t.next.value;
        t.next = null;
        this.size--;
        return val;
    }

    public int deleteAtPos(int idx){        // Delete from particular index.
        if(idx == 0){
            int val = deleteFirst();
            return val;
        }
        if(idx >= size){
            int val = deleteLast();
            return val;
        }
        Node t = get(idx);
        int val = t.next.value;
        t.next = t.next.next;
        return val;
    }

    public Node get(int idx){               // Fetch node of a particular index.
        Node tmp = head;
        for(int i = 1; i < idx; i++){
            tmp = tmp.next;
        }
        return tmp;
    }

    public void display(){              // Printing the Linked List.
        Node temp = this.head;          // We shouldn't change the head pointer location.
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node {                    // Node Class
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
            this.next = null;
        }
    }

}