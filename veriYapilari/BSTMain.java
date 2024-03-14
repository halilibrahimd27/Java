package youtube2;

public class BSTMain {

	public static void main(String[] args) {
		
		BST bst = new BST();
	
		bst.add(30);
		bst.add(20);
		bst.add(15);
		bst.add(40);
		bst.add(50);
		bst.add(45);
		bst.add(38);
		bst.add(12);
		bst.add(18);
		bst.print();
		System.out.println(" ");
		
		System.out.println(bst.search(50));
		System.out.println(" ");
		
		bst.preOrder();
		System.out.println(" ");
		bst.inOrder();
		System.out.println(" ");
		bst.postOrder();
		System.out.println(" ");
		System.out.println(" ");
		
		bst.delete(40);
		bst.print();
		
		
	}
	
}
