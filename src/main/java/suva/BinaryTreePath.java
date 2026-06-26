package suva;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if(node == null) {
            return;
        }
        path = path.isEmpty() ? String.valueOf(path) : path + "->" + node.val;
        // is leaf node
        if(node.left == null && node.right == null) {  
            result.add(path);
        } 
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        BinaryTreePath solution = new BinaryTreePath();
        System.out.println(solution.binaryTreePaths(root));
    }
}
