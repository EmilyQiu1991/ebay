
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findSecondMinValue(TreeNode root) {
		if(root == null) return -1;
		int ans = minVal(root, root.val);
		return ans;
	}
	
	private int minVal(TreeNode p, int first) {
		if(p == null) return -1;
		if(p.val != first) return p.val;
		
		int left = minVal(p.left,first);
		int right = minVal(p.right,first);
		
		//if all nodes of a subtree == root.val
		//there is no second minimum value, return -1
		
		if(left == -1) return right;
		if(right == -1) return left;
		return Math.min(left, right);
	}

}
