package DSA;

public class Solution {
public static class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}
private static int maxSum;
public static int maxPathSum(TreeNode root) {
	maxSum  = Integer.MIN_VALUE;
	maxGain(root);
	return maxSum;
}
public static int  maxGain(TreeNode node) {
	if(node == null) return 0;
    System.out.println("Visiting node: " + node.val);

    int left = Math.max(maxGain(node.left), 0);
    int right = Math.max(maxGain(node.right), 0);
    
    int current  = node.val + left+ right;
    System.out.println("At node " + node.val + ": leftGain = " + left +
            ", rightGain = " + right +
            ", currentMaxPath = " + current);
    maxSum = Math.max(maxSum, current);
    return node.val + Math.max(left, right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxPathSum(root);
        System.out.println("Max Path Sum: " + result);
	}

}
