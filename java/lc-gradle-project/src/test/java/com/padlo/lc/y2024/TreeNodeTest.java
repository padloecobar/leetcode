package com.padlo.lc.y2024;

import com.padlo.lc.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TreeNodeTest {

    @Test
    public void testBasicTree() {
        TreeNode tree1 = TreeNode.parse("[1,2,3,null,null,4,5]");
        assertEquals(1, tree1.val);
        assertEquals(2, tree1.left.val);
        assertEquals(3, tree1.right.val);
        assertEquals(4, tree1.right.left.val);
        assertEquals(5, tree1.right.right.val);
    }

    @Test
    public void testEmptyTree() {
        TreeNode tree2 = TreeNode.parse("[]");
        assertNull(tree2);
    }

    @Test
    public void testSingleNode() {
        TreeNode tree3 = TreeNode.parse("[1]");
        assertEquals(1, tree3.val);
        assertNull(tree3.left);
        assertNull(tree3.right);
    }

    @Test
    public void testComplexTree() {
        TreeNode tree4 = TreeNode.parse("[1,2,3,4,null,5,6]");
        assertEquals(1, tree4.val);
        assertEquals(2, tree4.left.val);
        assertEquals(3, tree4.right.val);
        assertEquals(4, tree4.left.left.val);
        assertEquals(5, tree4.right.left.val);
        assertEquals(6, tree4.right.right.val);
    }
}
