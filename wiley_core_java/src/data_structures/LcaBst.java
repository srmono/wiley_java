package data_structures;

//Lowest Common Ancestor (LCA) in a Binary Search Tree (BST)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LcaBst {
    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
        }

        if (root.val > p && root.val > q) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p && root.val < q) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        
    	/*
                    6
                   / \
                  2   8
                 / \ / \
                0  4 7  9
                  / \
                 3  5
        */
    	
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        int p = 2;
        int q = 4;
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + lca.val);
    }
}


//we define a TreeNode class representing a node in the BST. Each TreeNode object has a value (val) and left and right child pointers.
//
//The lowestCommonAncestor method takes the root of the BST and two values (p and q) as input and returns the LCA of the nodes with values p and q in the BST. It uses the property of a BST, where the left subtree contains values less than the current node, and the right subtree contains values greater than the current node.
//
//The method recursively traverses the BST starting from the root. If both p and q are smaller than the current node's value, the LCA must be in the left subtree. If both p and q are greater than the current node's value, the LCA must be in the right subtree. If neither of these conditions is true, it means the current node is the LCA.
//
//In the main method, we create a BST with the values shown in the comment above the tree. We then call the lowestCommonAncestor method with values 2 and 4. The LCA of nodes with values 2 and 4 in the BST is expected to be 2, and it will be printed as the output.
//
//Note that this implementation assumes that both p and q are present in the BST. If either or both of them are not present, the method will still return the LCA of the existing nodes.
//		
//		