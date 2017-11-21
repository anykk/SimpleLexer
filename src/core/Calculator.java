package core;

import java.util.Stack;

public class Calculator {

    private boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!((c == ')' && top == '(') || (c == ']' && top == '[')
                        || (c == '}' && top == '{') || (c == '>' && top == '<'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private String getExrpession() {
        return null;
    }

    String calculate(String expression) {
        if (!isCorrect(expression))
            throw new RuntimeException("Illegal bracket balance!");

        return null;
    }
}
