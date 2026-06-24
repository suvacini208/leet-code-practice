package suva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBFS  {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> result = new ArrayList<>();

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currIntegers = new ArrayList<>();

            for(int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currIntegers.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(currIntegers);
        }

        return result;
    }

    public static void main(String[] args) {
        // Build the tree
        //       3
        //      / \
        //     9   20
        //        /  \
        //       15    7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
        // Expected: [[3], [9, 20], [15, 7]]
    }
}
