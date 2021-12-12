package com.company;

import java.util.Stack;

public class ValidParentheses {
    public static char [][] TOKENS = {
            {'[', ']'},
            {'(', ')'},
            {'{', '}'}
    };

    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                charStack.push(c);
            }
            else {
                if ((charStack.isEmpty()) || (!matches(charStack.pop(), c))) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }

    private static boolean isOpen(char c) {
        for (char [] array : TOKENS) {
            if (c == array[0]) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(char openTerm, char closeTerm) {
        for (char [] array : TOKENS) {
            if ((openTerm == array[0]) && (closeTerm == array[1])) {
                return true;
            }
        }
        return false;
    }
}
