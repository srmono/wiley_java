package data_structures;

import java.util.*;

class TreeNodeOne {
    int val;
    TreeNodeOne left;
    TreeNodeOne right;

    TreeNodeOne(int val) {
        this.val = val;
    }
}

public class BinaryTreeTopView {
    public static void printTopView(TreeNodeOne root) {
        if (root == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode current = queue.poll();
            if (!map.containsKey(current.hd)) {
                map.put(current.hd, current.node.val);
            }

            if (current.node.left != null) {
                queue.add(new QueueNode(current.node.left, current.hd - 1));
            }

            if (current.node.right != null) {
                queue.add(new QueueNode(current.node.right, current.hd + 1));
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                   \   \
                    4   5
                     \
                      6
        */
        TreeNodeOne root = new TreeNodeOne(1);
        root.left = new TreeNodeOne(2);
        root.right = new TreeNodeOne(3);
        root.left.right = new TreeNodeOne(4);
        root.right.right = new TreeNodeOne(5);
        root.left.right.right = new TreeNodeOne(6);

        System.out.println("Top view of the binary tree:");
        printTopView(root);
    } 
}

class QueueNode {
    TreeNodeOne node;
    int hd;

    QueueNode(TreeNodeOne node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}


/*
we define a TreeNode class representing a node in the binary tree. Each TreeNode object has a value (val) and left and right child pointers.

The printTopView method takes the root of the binary tree as input and prints the top view of the tree. It uses a map (TreeMap) to store the first encountered node at each horizontal distance (hd) from the root. It also uses a queue to perform a level-order traversal of the tree.

During the traversal, for each node, we check if the horizontal distance is encountered for the first time (!map.containsKey(current.hd)). If so, we add the node's value to the map at the corresponding horizontal distance. We then enqueue the left and right child nodes (if they exist) along with their updated horizontal distances.

Finally, we iterate over the map values and print them, which will give us the top view of the binary tree.

In the main method, we create a binary tree with the values shown in the comment above the tree. We then call the printTopView method to print the top view of the binary tree.
*/