package takeyouforward;
import java.util.*;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		val = data;
		left=null;
		right= null;
	}
}
public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.right.left = new TreeNode(31);
		root.right.right = new TreeNode(32);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.left.left.left = new TreeNode(60);
		root.left.right.left = new TreeNode(70);
		q.offer(root);
		TreeNode temp = new TreeNode(0);
		if(root==null) return;
		while(!q.isEmpty()) {
			int len = q.size();
			List<Integer> ds = new ArrayList<>();
				for(int i =0;i<len;i++) {
					if(q.peek().left!=null) q.offer(q.peek().left);
					//else q.offer(temp);
					if(q.peek().right!=null) q.offer(q.peek().right);
					//else q.offer(temp);
					ds.add(q.poll().val);
				}
				arr.add(ds);	
		}
		System.out.println(arr);
	}

}
