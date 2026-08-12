/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       TreeNode temp = root;
       List<Integer> list = new ArrayList<>();
       Stack<TreeNode> st = new Stack<>();
       while(true){
        if(temp != null){
            st.push(temp);
            temp = temp.left;
        }
        else{
            if(st.isEmpty())break;
            
            temp = st.pop();
            list.add(temp.val);
            temp = temp.right;
        }
       }
        return list;
    }
}