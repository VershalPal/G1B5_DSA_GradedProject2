package assignment2;

public class Driver
{
	public static void main(String[] args)
	{
		SkewedTree tree = new SkewedTree();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.left.left.right = new Node(20);
		tree.root.right.left = new Node(55);
		tree.bstToRightSkewed(tree.root);
		
		System.out.println("The node values from the Skewed Tree in ascending order are :");
		tree.printSkewedTree();
	}
}