package youtube2;

public class BST {

	Node root;
	
	public BST() {
		root = null;
	}
	
	public void delete(int a) {
		deleteRecursive(root,a);
	}
	
	private Node deleteRecursive(Node current, int a) {
		
		if(current == null ) {
			return current;
		}
		if (current.data > a) {
			current.left = deleteRecursive(current.left, a);
		}
		if (current.data < a) {
			current.right = deleteRecursive(current.right, a);
		}else {
			if (current.left == null) {
				return current.right;
			}
			 if (current.right == null) {
				return current.left;
			}
			int leftMax = findMax(current.left);
			current.data = leftMax;
			current.left = deleteRecursive(current.left, leftMax);
		}
		return current;
	}
	
	public void preOrder() {
		preOrderRecursive(root);
	}
	
	private void preOrderRecursive(Node current) {
		if (current != null) {
			System.out.print(current.data + " ");
			preOrderRecursive(current.left);
			preOrderRecursive(current.right);
		}
	}
	
	public void inOrder() {
		inOrderRecursive(root);
	}
	
	private void inOrderRecursive(Node current) {
		if (current != null) {
			inOrderRecursive(current.left);
			System.out.print(current.data + " ");
			inOrderRecursive(current.right);
		}
	}
	
	public void postOrder() {
		postOrderRecursive(root);
	}
	
	private void postOrderRecursive(Node current) {
		if (current != null) {
			postOrderRecursive(current.left);
			postOrderRecursive(current.right);
			System.out.print(current.data + " ");
		}
	}
	
	public void add(int a) {
		root = addRecursive(root,a);
	}
	
	private Node addRecursive(Node current, int a) {
		
		if(current == null ) {
			current = new Node(a);
			return current;
		}else if (current.data > a) {
			current.left = addRecursive(current.left, a);
		}else if (current.data < a) {
			current.right = addRecursive(current.right, a);
		}
		return current;
	}
	
	public Node search(int s) {
		return searchRecursive(root, s);
	}
	
	private Node searchRecursive(Node current, int s) {
		if (current == null || current.data == s) {
			return current;
		}
		if (current.data < s) {
			return searchRecursive(current.right, s);
		}else {
			return searchRecursive(current.left, s);
		}
	}
	
	public int findMax(Node current) {
		int max = current.data;
		while (current.right != null) {
			max = current.right.data;
			current = current.right;
		}
		return max;
	}
	
	public void print() {
		printRecursive(root,"");
	}
	
	private void printRecursive(Node current,String indent) {
		System.out.println(indent + current.data);
		if (current.left != null) {
			printRecursive(current.left, indent + "   ");
		}
		if (current.right != null) {
			printRecursive(current.right, indent + "   ");
		}
	}
}