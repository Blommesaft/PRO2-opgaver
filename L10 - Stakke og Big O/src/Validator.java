import java.util.Stack;

public class Validator {


    public boolean validateBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
