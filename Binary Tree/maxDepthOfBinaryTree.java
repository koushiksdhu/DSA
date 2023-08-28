// Maximum Depth of a Binary Tree:

import java.util.*;

class Node{
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class maxDepthOfBinaryTree {
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        if(root == null)
            System.exit(0);

        Stack<Node> stk = new Stack<>();
        stk.push(root);
        
        int nodeCount = 0;

        while(!stk.isEmpty()){
            Node n = stk.pop();
            nodeCount++;

            if(n.left != null)
                stk.push(n.left);
            if(n.right != null)
                stk.push(n.right);
        }
        System.out.println("Height of the Binary Tree: "+(int)(Math.log(nodeCount)/Math.log(2)+1));



        // Using Recursion:

        System.out.println(maxDepth(root));
    }
    // Height of a tree using recursive approach:

    static int maxDepth(Node root){
        if(root == null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1+Math.max(lh, rh);
    }
}
