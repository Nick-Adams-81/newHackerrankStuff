package HackerrankAndLeetcodePractice;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParens(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') stack.push(c);
            else if(c == '}' && stack.peek() == '{') stack.pop();
            else if(c == ']' && stack.peek() == '[') stack.pop();
            else if(c == ')' && stack.peek() == '(') stack.pop();
        }
        return stack.isEmpty();
    }
}

