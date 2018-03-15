public class Main {

    /**
     * Definition for a binary tree node.
     **/
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode leftNode  = root.left;
        root.left = root.right;
        root.right = leftNode;
        if(root.left != null)
            invertTree(root.left);
        if(root.right !=null)
            invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        Main main = new Main();
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2);
        treeNode.left = treeNode1;
        TreeNode treeNode2 = new TreeNode(7);
        treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(1);
        treeNode3.left = treeNode3;
        TreeNode treeNode4 = new TreeNode(3);
        treeNode.right = treeNode4;
        main.invertTree(treeNode);
    }
}
