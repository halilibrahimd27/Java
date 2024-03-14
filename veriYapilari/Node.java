package youtube2;

public class Node {
	int data;
	int boy;
	Node left;
	Node right;
	
	public Node(int a) {
		data = a;
		boy = 1;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
