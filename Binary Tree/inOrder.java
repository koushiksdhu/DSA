// InOrder Traversal:

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

// Using Recursion:

public class inOrder {
    public static void main(String args[]){
        Node root = new Node(1);      // Root Node
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("InOrder Traversal: ");
        inOrd(root);
    }
    static void inOrd(Node n){
        if(n == null)
            return;
        inOrd(n.left);
        System.out.print(n.val+" ");
        inOrd(n.right);
    }
}
