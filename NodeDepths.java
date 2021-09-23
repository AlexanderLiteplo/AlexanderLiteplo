public class NodeDepths {
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return nodeDepthsHelper(root,0);
    }

    public static int nodeDepthsHelper(BinaryTree root, int sum) {

        if(root == null)
            return 0;

        // if(root.left == null && root.right == null)
        // 	return ++sum;
        System.out.println(sum);

        return sum + nodeDepthsHelper(root.right, sum + 1) + nodeDepthsHelper(root.left, sum + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
