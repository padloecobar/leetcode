package com.padlo.lc.y2024;

import com.padlo.lc.util.TreeNode;

import java.util.*;

/*
https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/description/?envType=daily-question&envId=2024-12-23
 */
public class LC2471 {
    public static void main(String[] args) {

    }

    public static int minimumOperations(TreeNode root) {
        int answer = 0;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int swapped = 0;
            HashMap<Integer, Integer> map = new HashMap<>(size);
            int[] list =new int[size];
            int[] slist =new int[size];
            for (int i = 0; i < size; i++) {
                var node = queue.poll();
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
                map.put(node.val, i);
                list[i] = node.val;
                slist[i] = node.val;
            }
            Arrays.sort(slist);
            for (int i = 0; i < size; i++) {
                if(list[i] == slist[i]) continue;
                int target = slist[i];
                int targetIdx = map.get(target);
                //swap
                int tmp = list[i];
                list[i] = target;
                list[targetIdx]= tmp;
                map.put(tmp, targetIdx);
                swapped++;
            }
            answer += swapped;
        }
        return answer;

    }
}
