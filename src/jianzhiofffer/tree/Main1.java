package jianzhiofffer.tree;
/**
 * 从上往下打印出二叉树的每个节点，
 * 同层节点从左至右打印
 * @author liukunsheng 
 */
import java.util.*;

import jianzhiofffer.TreeNode;
public class Main1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {     
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(root==null) {
    		return null;
    	}
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		TreeNode tmp =queue.poll();
    		result.add(tmp.val);
    		if(tmp.left!=null) {
    			queue.add(tmp.left);
    		}
    		if(tmp.right!=null) {
    			queue.add(tmp.right);
    		}
    	}
    	return result; 
    }
}
