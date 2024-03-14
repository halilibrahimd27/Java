package youtube2;

public class AVL {
	Node root;
	public AVL() {
		this.root=null;
	}
	public void ekle(int data) {
		root=ekleRecursive(root,data);
	}
	private Node ekleRecursive(Node current,int data) {
		if(current==null) {
			current=new Node(data);
			return current;
		}
		else if(current.data<data) {
			current.right=ekleRecursive(current.right,data);
		}
		else if(current.data>data) {
			current.left=ekleRecursive(current.left,data);
		}
		current.boy=1+boymax(boy(current.left),boy(current.right));
		int denge=denge(current);
		if(denge==2 && current.left.data>data) {
			return sagRotasyon(current);
		}
		if(denge==-2 && current.right.data>data) {
			current.right=sagRotasyon(current.right);
			return solRotasyon(current);
		}
		if(denge==2 && current.left.data<data) {
			current.left=solRotasyon(current.left);
			return sagRotasyon(current);
		}
		if(denge==-2 && current.right.data<data) {
			return solRotasyon(current);
		}
		return current;
	}
	private int boy(Node current) {
		if(current==null) {
			return 0;
		}
		else {
			return current.boy;
		}
		
	}
	private int boymax(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	private int denge(Node current) {
		return boy(current.left)-boy(current.right);
	}
	private Node solRotasyon(Node current) {
		Node y=current.right;
		Node a=y.left;
		y.left=current;
		current.right=a;
		current.boy=1+boymax(boy(current.right),boy(current.left));
		y.boy=1+boymax(boy(y.left),boy(y.right));
		return y;
		
	}
	private Node sagRotasyon(Node current) {
		Node y=current.left;
		Node a=y.right;
		y.right=current;
		current.left=a;
		current.boy=1+boymax(boy(current.right),boy(current.left));
		y.boy=1+boymax(boy(y.left),boy(y.right));
		return y;
	}
	public void sil(int data) {
		root=silRecursive(root,data);
	}
	private Node silRecursive(Node current,int data) {
		if(current==null) {
			return current;
		}
		else if(current.data<data) {
			current.right=silRecursive(current.right,data);
		}
		else if(current.data>data) {
			current.left=silRecursive(current.left,data);
		}
		else {
			if(current.right==null) {
				return current.left;
			}
			else if(current.left==null) {
				return current.right;
			}
			else {
				int max=max(current.left);
				if(max!=0) {
					current.data=max;
					current.left=silRecursive(current.left,max);
				}
				else {
					max=max2(current.right);
					current.data=max;
					current.right=silRecursive(current.right,max);
				}
			}
		}
		current.boy=1+boymax(boy(current.left),boy(current.right));
		int denge=denge(current);
		if(denge==2 ) {
			if(denge(current.left)>=0) {
				return sagRotasyon(current);
			}
			else {
				current.left=solRotasyon(current.left);
				return sagRotasyon(current);
			}
			
		}
		if(denge==-2 ) {
			if(denge(current.right)<=0) {
				return solRotasyon(current);
			}
			else {
				current.right=sagRotasyon(current.right);
				return solRotasyon(current);
			}
			
		}
		return current;
		}
	private int max(Node current) {
		int max=0;
		if(current==null) {
			return 0;
		}
		Node tmp=current;
		while(tmp.right!=null) {
			tmp=tmp.right;
		}
		max=tmp.data;
		return max;
	}
	private int max2(Node current) {
		int max=0;
		Node tmp=current;
		while(tmp.left!=null) {
			tmp=tmp.left;
		}
		max=tmp.data;
		return max;
	}
	public void yazdır() {
		yazdırRecursive(root,"");
	}
	private void yazdırRecursive(Node current,String indent) {
		System.out.println(indent+current.data);
		if(current.left!=null) {
			yazdırRecursive(current.left,indent+"    ");
		}
		if(current.right!=null) {
			yazdırRecursive(current.right,indent+"    ");
		}
	}
}
