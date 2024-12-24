package com.padlo.lc.y2024;

import com.padlo.lc.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC2471Test {

    @Test
    void test() {
        assertEquals(
                LC2471.minimumOperations(
                        TreeNode.parse("[1,4,3,7,6,8,5,null,null,null,null,9,null,10]")),
                3);
    }
}
