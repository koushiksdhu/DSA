// PostOrder Traversal:

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

public class postOrder {
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Post Order Traversal: ");
        post(root);
    }
    static void post(Node n){
        if(n == null)
            return;
        post(n.left);
        post(n.right);
        System.out.print(n.val+" ");
    }
}
