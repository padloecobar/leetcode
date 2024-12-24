package com.padlo.lc.y2024;

import java.util.Deque;
import java.util.LinkedList;

public class LC32 {
    public static void main(String[] args) {

    }

    public static int longestValidParentheses(String s) {
        int answer = 0;
        int n = s.length();
        Deque<Integer> queue = new LinkedList<>();
        int streak = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '('){
                queue.addLast(streak);
                streak = 0;
            } else {
                if(queue.isEmpty()){
                    //break
                    streak = 0;
                    continue;
                } else {
                    streak +=2 + queue.pollLast();
                    answer = Math.max(answer, streak);
                }
            }
        }


        return answer;
    }
    /*
    *   ( ( ( ( ( ) ) ) ) ) ) ( ) ) ( )
    *           10       ) ( ) ) ( )
    *   (                  )
    * */
}
