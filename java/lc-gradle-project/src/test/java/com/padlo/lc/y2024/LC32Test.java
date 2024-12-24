package com.padlo.lc.y2024;

import org.junit.jupiter.api.Test;

import static com.padlo.lc.y2024.LC32.longestValidParentheses;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC32Test {
    @Test
    void test(){
        assertEquals(longestValidParentheses("(()"), 2);
        assertEquals(longestValidParentheses(")()())"), 4);
        assertEquals(longestValidParentheses(""), 0);
        assertEquals(longestValidParentheses("()(()))"), 6);

    }
}
