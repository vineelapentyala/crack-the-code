public class MinimalTree {

//     Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
     }
     public TreeNode minimalTree(int[] nums){
         return addNodes(nums, 0, nums.length -1);
     }
    public TreeNode addNodes(int[] nums, int left, int right){
        if (left > right) return null;
        int mid = left + (right -left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = addNodes(nums, left, mid-1);
        root.right = addNodes(nums, mid + 1, right);
        return root;
    }

}
