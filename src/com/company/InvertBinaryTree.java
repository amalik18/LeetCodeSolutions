package com.company;

public class InvertBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode (int val) {
            this.val = val;
        }
        TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        else {
            TreeNode leftTree = root.left;
            root.left = root.right;
            root.right = leftTree;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main (String [] args) {
        TreeNode leftTree = new TreeNode(2);
        leftTree.left = new TreeNode(1);
        leftTree.right = new TreeNode(3);
        TreeNode rightTree = new TreeNode(7);
        rightTree.left = new TreeNode(6);
        rightTree.right = new TreeNode(9);
        TreeNode root = new TreeNode(4, leftTree, rightTree);
        TreeNode inverted = invertTree(root);
        System.out.println(inverted);
    }
}
