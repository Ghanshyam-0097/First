
public class BineryTree {

	class Node{
		Node left;
		int data;
		Node right;
		public Node(int data) {
			super();
			this.left = null;
			this.data = data;
			this.right = null;
		}
		
	}
	Node root;
	public BineryTree() {
		super();
		this.root =null ;
	}
	
	public void add(int val) {
		root=inserdata(root,val);
	}

	private Node inserdata(Node root, int val) {
		Node newnode = new Node(val);
		if(root==null) {
			root=newnode;
			return root;
		}
	
		if(val<root.data) {
			root.left = inserdata(root.left, val);
		}else {
			root.right = inserdata(root.right, val);
		}
		return root;
	}
	

	
	public void preorder() {
		     preorderTraversal(root);
	}
    
	public void preorderTraversal(Node root) {  
		if(root!=null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	
	public boolean Searchvalue(int val) {
		return binarysearchdata(root,val);
	}

	private boolean binarysearchdata(Node root, int val) {
		if(root==null) 
			return false;
		if(root.data==val) {
			return true;
		}else if(val<root.data){
			return binarysearchdata(root.left,val);
		}else {
			return binarysearchdata(root.right, val);
		}

	}
	
}
