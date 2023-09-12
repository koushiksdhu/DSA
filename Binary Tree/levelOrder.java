// Level Order Traversal:

import java.util.*;


public class levelOrder {

    static class Node {        // Inner class declared as static.
        int value;
        Node left;
        Node right;

        Node(int var1) {
            this.value = var1;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        System.out.print("Level Order Traversal: ");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
                System.out.print(temp.value + " ");
            }
        }
    }
}
