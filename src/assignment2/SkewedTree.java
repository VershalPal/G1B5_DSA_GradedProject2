package assignment2;

public class SkewedTree
{
	Node root;
	Node head;

	public SkewedTree()
	{
		this.root = null;
		this.head = null;
	}

	public void bstToRightSkewed(Node node)
	{
		if (node == null)
		{
			return;
		}

		bstToRightSkewed(node.left);

		Node rightNode = node.right;
		if (head == null)
		{
			head = node;
			root = node;
			node.left = null;
		}
		else
		{
			root.right = node;
			node.left = null;
			root = node;
		}
		
		bstToRightSkewed(rightNode);
	}

	public void printSkewedTree()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}
}