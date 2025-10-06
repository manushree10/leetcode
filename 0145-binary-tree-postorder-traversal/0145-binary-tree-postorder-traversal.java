class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postorder(node.left, result);   // 1️⃣ Left
        postorder(node.right, result);  // 2️⃣ Right
        result.add(node.val);           // 3️⃣ Root
    }
}
