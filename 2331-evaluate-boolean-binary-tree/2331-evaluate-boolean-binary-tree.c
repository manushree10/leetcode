/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool evaluateTree(struct TreeNode* root) {
    bool left_val;
    bool right_val;
    if (root->val == 0) return false;
        if (root->val == 1) return true;
    left_val=evaluateTree(root->left);
    right_val=evaluateTree(root->right);
    if (root->val == 2)  // OR operation
            return left_val || right_val;
        if (root->val == 3)  // AND operation
            return left_val && right_val;
    else
        return false;
}