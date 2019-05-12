package com.tugas.main;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String[] str = {"()", "{()}", "{[()]}", "([()])", "({)", "[{})]", "[]]"};
        for (String item : str) {
            if (checkParentesis(item)) {
                System.out.println("valid");
            } else {
                System.out.println("Not valid");
            }
        }
    }

    public static boolean isParenthesisMatch(String str) {
        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(') {
                stack.push(c);
            }
            else if(c == '{') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.empty()) {
                    return false;
                }
                else if(stack.peek() == '(') {
                    stack.pop();
                }else {
                    return false;
                }
            }
            else if(c == '}') {
                if(stack.empty()) {
                    return false;
                }
                else if(stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean checkParentesis(String str) {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

