public class BST {

    static class BSTNode {
        AccountNode data;
        BSTNode left, right;

        BSTNode(AccountNode data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    BSTNode root = null;

    // Insert record according to website name
    public BSTNode insert(BSTNode root, AccountNode data) {
        if(root == null) {
            return new BSTNode(data);
        }

        if(data.getWebName().compareTo(root.data.getWebName()) < 0) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Inorder traversal displays records in sorted order
    public void inOrder(BSTNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
