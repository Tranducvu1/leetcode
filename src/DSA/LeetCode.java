package DSA;

public class LeetCode {
public static class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}
	 public static int maxDepth(TreeNode root) {
	        if(root == null ) return 0;
	        int left = maxDepth(root.left);
	        int right = maxDepth(root.right);
	        
	        return 1 + Math.max(left, right);
	    }
	 public static TreeNode buildTree() {
	        TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(9);
	        root.right = new TreeNode(20);
	        root.right.left = new TreeNode(15);
	        root.right.right = new TreeNode(7);
	        return root;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = buildTree(); // gọi hàm tạo cây

        int depth = maxDepth(root);
        System.out.println("Maximum Depth of Tree: " + depth); // ✅ Kết quả: 3
	}

}
