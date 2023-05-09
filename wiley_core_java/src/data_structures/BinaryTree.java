package data_structures;

// Tree traversal in java
class Node {
	int item;
	Node left, right;

	public Node(int key) {
		item = key;
		left = right = null;
	}
}

public class BinaryTree {
	// Root of the Binary Tree
	Node root;

	public BinaryTree() {
		root = null;
	}

	// Postorder traversal
	void postOrder(Node node) {
		if (node == null)
			return;

		// Traverse Left
		postOrder(node.left);
		// Traverse right
		postOrder(node.right);
		// Traverse root
		System.out.println(node.item + "-->");
	}

	// inorder traversal
	void inOrder(Node node) {
		if (node == null)
			return;

		// Traverse Left
		postOrder(node.left);
		// Traverse root
		System.out.println(node.item + "-->");
		// Traverse right
		postOrder(node.right);

	}

	// pre order traversal
	void preOrder(Node node) {
		if (node == null)
			return;

		// Traverse root
		System.out.println(node.item + "-->");
		// Traverse Left
		postOrder(node.left);
		// Traverse right
		postOrder(node.right);

	}

	public static void main(String[] args) {
		BinaryTree tree =new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		
		System.out.println("Inorder Traversal");
		tree.inOrder(tree.root);
		
		System.out.println("\nPreorder Traversal");
		tree.preOrder(tree.root);
		
		System.out.println("\nPostorder Traversal");
		tree.postOrder(tree.root);

	}

}
