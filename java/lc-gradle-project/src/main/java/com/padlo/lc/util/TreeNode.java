package com.padlo.lc.util;

import java.util.ArrayDeque;
import java.util.Queue;

//  Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode parse(String input) {
        if (input == null || input.isEmpty() || input.equals("[]")) {
            return null;
        }

        // Remove brackets and split the input string
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");

        // Handle empty tree
        if (parts.length == 0 || parts[0].equals("null")) {
            return null;
        }

        // Create the root node
        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < parts.length) {
            TreeNode current = queue.poll();

            // Process the left child
            if (i < parts.length && !parts[i].trim().equals("null")) {
                current.left = new TreeNode(Integer.parseInt(parts[i].trim()));
                queue.add(current.left);
            }
            i++;

            // Process the right child
            if (i < parts.length && !parts[i].trim().equals("null")) {
                current.right = new TreeNode(Integer.parseInt(parts[i].trim()));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("null");
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                System.out.print("null ");
            } else {
                System.out.print(node.val + " ");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        System.out.println();
    }
}
