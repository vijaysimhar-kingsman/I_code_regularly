package takeyouforward;
class node{
	int data;
	node left;
	node right;
	public node(int key){
		data = key;
	}


static void preorder(node root) {
	if(root == null) {
		return;
	}
	System.out.println(root.data);
	preorder(root.left);
	preorder(root.right);
}

public class BinaryTreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root = new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.left = new node(4);
		preorder(root);
		
		System.out.println("nodes created successfully");
	}

}}
