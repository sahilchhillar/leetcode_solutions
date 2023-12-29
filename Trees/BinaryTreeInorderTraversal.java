package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void inorderTraversal(TreeNode root, List<Integer> result){
        if(root == null) return;
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);

        System.out.println(result);
    }
}
