package DSADSADSA;

import java.util.Stack;

public class Balanced_paranthesis {
    public static void main(String[] args) {
        String exp = "[{}()]";
        System.out.println(isBalanced(exp) ? "BALANCED" : "NOT - BALANCED");
    }

    private static boolean isBalanced(String exp) {
        int j = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (ch == ')' && stack.peek() == '(' || ch == ']' && stack.peek() == '[' ||
                    ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(ch);
            }

        }
        return stack.isEmpty();
    }
}