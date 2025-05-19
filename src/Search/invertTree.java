package Search;

public class invertTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    	// ✅ Hàm đảo cây
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // ✅ Hàm tạo cây nhị phân đơn giản từ ví dụ tay
    public static TreeNode buildTree() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }

    // ✅ In cây theo kiểu duyệt trung bình (inorder)
    public static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        invertTree tree = new invertTree();

        TreeNode root = buildTree();
        System.out.print("Before invert (inorder): ");
        printTree(root);

        tree.invertTree(root);

        System.out.print("\nAfter invert (inorder):  ");
        printTree(root);
    }
}
