package data_structures;

class NodeThree {
	int data;
	NodeThree left, right;

	NodeThree(int d) {
		data = d;
		left = right = null;
	}
}

//Calculate height
class Height {
	int height = 0;
}

public class BalancedTree {
	NodeThree root;

	// Check height balance
	boolean checkHeightBalance(NodeThree root, Height height) {

		// Check for emptiness
		if (root == null) {
			height.height = 0;
			return true;
		}

		Height leftHeight = new Height(), rightHeight = new Height();

		boolean l = checkHeightBalance(root.left, leftHeight);
		boolean r = checkHeightBalance(root.right, rightHeight);

		int lh = leftHeight.height, rh = rightHeight.height;

		height.height = (lh > rh ? lh : rh) + 1;

		if ((lh - rh >= 2) || (rh - lh >= 2))
			return false;

		else
			return l && r;
	}

	public static void main(String[] args) {
		Height height = new Height();

		BalancedTree tree = new BalancedTree();

		tree.root = new NodeThree(1);
		tree.root.left = new NodeThree(2);
		tree.root.right = new NodeThree(3);
		tree.root.left.left = new NodeThree(4);
		tree.root.left.right = new NodeThree(5);
		//tree.root.right.right = new NodeThree(6);

		if (tree.checkHeightBalance(tree.root, height))
			System.out.println("The given tree is balanced");
		else
			System.out.println("The given tree is not balanced");

	}

}
