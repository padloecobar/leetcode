package com.padlo.lc.y2024;

import java.util.HashMap;

public class LC159 {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        int i = 1;
        int ans = 1;
        char prev = s.charAt(0);
        char prev_prev = prev;
        int prev_start = 0, prev_prev_start = 0;

        while (i < n) {
            char c = s.charAt(i);
            if (c == prev || c == prev_prev) {
                //keep adding
                if (prev != c) {
                    //handle streak to know its start
                    prev_start = i;
                    prev_prev = prev;
                    prev = c;
                }
                ans = Math.max(ans, i - prev_prev_start + 1);
                i++;
            } else {
                //start new
                prev_prev_start = prev_start; //cut off tail
                prev_prev = c; //to pass if statement next iter
            }
        }

        return ans;
    }
}
