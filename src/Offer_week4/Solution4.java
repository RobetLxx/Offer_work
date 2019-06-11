package Offer_week4;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author: lingjunhao
 * create at:  2019-05-10  20:26
 * @description:
 */
public class Solution4 {
    public TreeNode convert(TreeNode root) {
        if(root==null){return null;}
        TreeNode last=null;
        Stack<TreeNode> stack=new Stack<>();
        List<TreeNode> list=new LinkedList<>();
        while (!stack.isEmpty()||root!=null){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }else {
                root=stack.pop();
                TreeNode cur=root;
                cur.left=last;
                if (last!=null){
                    last.right=cur;
                }
                last=cur;
                root=root.right;
            }
        }
        TreeNode node=last;
        while (node!=null&&node.left!=null){
            node=node.left;
        }
        return node;
    }
    public int digitAtIndex(int n,int i) {
        String x=Integer.toString(n);
        char l=x.charAt(i);
        String s=String.valueOf(l);
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution4 a=new Solution4();
        System.out.println(a.digitAtIndex(124573,2));
    }
}
