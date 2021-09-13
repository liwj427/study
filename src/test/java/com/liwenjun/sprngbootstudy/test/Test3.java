package com.liwenjun.sprngbootstudy.test;

import java.util.Stack;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/9/8 4:09 下午
 * @Version: 1.0
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println(strIsVaild("(())"));
    }

    private static boolean strIsVaild(String s) {
        if (null == s || s.length() <= 0) {
            return true;
        }
        int n = s.length();
        int sum = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
                sum++;
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                    sum--;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static int longestVaildStr(String s) {
        if (null == s || s.length() <= 0) {
            return 0;
        }
        int len = s.length();
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i- stack.peek());
                }
            }
        }
        return max;
    }
}
