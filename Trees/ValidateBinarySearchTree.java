package Trees;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public static boolean validateBinarySearchTreeRecursive(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        
        if((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        return validateBinarySearchTreeRecursive(root.left, min, root.val) && validateBinarySearchTreeRecursive(root.right, root.val, max);
    }

    public static void validateBinarySearchTreeIterative(TreeNode root, List<Integer> res){
        if(root == null) return;
        validateBinarySearchTreeIterative(root.left, res);
        res.add(root.val);
        validateBinarySearchTreeIterative(root.right, res);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(validateBinarySearchTreeRecursive(root, null, null));

        List<Integer> result = new ArrayList<>();
        validateBinarySearchTreeIterative(root, result);

        for(int i=0; i<result.size()-1; i++){
            if(result.get(i) >= result.get(i+1)){
                System.out.println(false);
                break;
            }
        }

        System.out.println(true);
    }
}
