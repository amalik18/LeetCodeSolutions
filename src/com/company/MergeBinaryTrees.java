package com.company;

public class MergeBinaryTrees {
    public TreeNode mergeTree(TreeNode root1, TreeNode root2) {
        // Start from the root node
        return null;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}

