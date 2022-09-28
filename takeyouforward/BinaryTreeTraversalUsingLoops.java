package takeyouforward;
import java.util.*;

import takeyouforward.TreeNode;

public class BinaryTreeTraversalUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.right.left = new TreeNode(31);
		root.right.right = new TreeNode(32);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.left.left.left = new TreeNode(60);
		root.left.right.left = new TreeNode(70);
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		//this code for iterative preorder travessal  - root left right
		//the main logic is we are having a stack and pushing elements to it appending
		//right element first inorder to print left item first
//		while(!s.isEmpty()) {
//			TreeNode temp = s.pop();
//			arr.add(temp.val);
//			
//			if(temp.right!=null) s.push(temp.right);
//			if(temp.left!=null) s.push(temp.left);
//			
//		}
//		System.out.println(arr);
//		
		// now its time to print inorder traversal - left root right
		//traverse left if it is null pop the element from the stack
			
//		s.empty();
//		arr.clear();
		TreeNode node = root;
//		while(true){
//			if(node!=null) {
//				s.push(node);
//				node=node.left;
//			}else {
//				if(s.isEmpty()) break;
//				node=s.pop();
//				arr.add(node.val);
//				node = node.right;
//			}
//		}
//		System.out.println(arr);
//		
		//post order traversal using two stacks 
		
		Stack<TreeNode> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		node = root;
		s1.push(node);
		while(!s1.isEmpty()) {
			TreeNode temp = s1.pop();
			if(temp.left!=null) s1.push(temp.left);
			if(temp.right!=null) s1.push(temp.right);
			s2.add(temp.val);
		}
		while(!s2.isEmpty()) {
			System.out.print(s2.pop()+" ");
		}
	}

}
