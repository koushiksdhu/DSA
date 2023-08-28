// PreOrder, PostOrder and InOrder traversals using a single stack.

/*
ALGORITHM:

    We will take one pair(node, num) and push it into the stack.
    if num == 1 in pair:
        add to preorder
        num++ -> pair(node, num+1)
        if left exist:
            push it into stack
    
    if num == 2 in pair:
        add to inorder
        num++ -> pair(node, num+1)
        if right exist:
            push it into stack

    if num == 3 in pair:
        add to postorder
        popout that pair from stack. 
 */

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class preInPostTraversals {  
    public static void main(String args[]){
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left =  new Node(6);
        root.right.right = new Node(7);

        Stack<Pair<Node, Integer>> stk = new Stack<>();

        stk.push(new Pair<Node, Integer>(root, 1));

        ArrayList<Integer> preOrder = new ArrayList<>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();
        
        if(root == null)
            System.exit(0);

        while(!stk.isEmpty()){
            Pair<Node, Integer> idx = stk.pop();

            if(idx.num == 1){
                preOrder.add(idx.node.val);
                idx.num++;
                stk.push(idx);

                if(idx.node.left != null)
                    stk.push(new Pair<Node, Integer>(idx.node.left, 1));
            }

            else if(idx.num == 2){
                inOrder.add(idx.node.val);
                idx.num++;
                stk.push(idx);
                if(idx.node.right != null)
                    stk.push(new Pair<Node, Integer>(idx.node.right, 1));
            }

            else{
                postOrder.add(idx.node.val);
            }
        }
        
        System.out.println("PreOrder Traversal: "+preOrder.toString()); 
        System.out.println("InOrder Traversal: "+inOrder.toString());
        System.out.println("PostOrder Traversal: "+preOrder.toString());
    }    
}
