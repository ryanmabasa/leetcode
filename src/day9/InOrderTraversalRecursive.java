package day9;

public class InOrderTraversalRecursive {

    private static TreeNode prev = null;


    public static boolean isValidBST(TreeNode root) {
            return isValid(root);

    }

    private static boolean isValid(TreeNode root){

        if (root == null) return true;
        boolean left = isValidBST(root.left);

        if (prev != null && root.val <= prev.val) return false;
        prev = root;

        boolean right = isValidBST(root.right);
        return left && right;
    }
}
