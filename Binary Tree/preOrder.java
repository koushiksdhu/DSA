// Pre-Order Traversal:
import java.util.*;

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

// Using Recursive Method:

public class preOrder {
    public static void main(String args[]){
        
        Node n1 = new Node(1);      // Root Node
        n1.left = new Node(2);
        n1.right = new Node(5);
        n1.left.left = new Node(3);
        n1.left.right = new Node(4);
        n1.right.left = new Node(6);
        n1.right.right = new Node(7);

        System.out.print("PreOrder Traversal: ");
        pre(n1);
        
    }
    static void pre(Node n){
        if(n == null)
            return;
        System.out.print(n.val+" ");
        pre(n.left);
        pre(n.right);
    }
}