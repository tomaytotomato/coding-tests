package tomaytotomato;

import java.util.Stack;

/**
 * Hello world!
 */
public class Brackets {
    private static final Character OPEN_PARENTHESIS = '(';
    private static final Character CLOSE_PARENTHESIS = ')';

    public static void main(String[] args) {
        System.out.println("Brackets app");
    }

    public static boolean isParenthesisMatch(String parenthesisExpression) {

        final Stack<Character> parenthesisStack = new Stack<>();

        if (parenthesisExpression == null || parenthesisExpression.equals("")) {
            return false;
        }

        for (int i = 0; i < parenthesisExpression.length(); i++) {
            final Character c = parenthesisExpression.charAt(i);

            if (c.equals(OPEN_PARENTHESIS)) {
                parenthesisStack.push(c);
            } else if (c.equals(CLOSE_PARENTHESIS)) {
                if (parenthesisStack.empty()) {
                    return false;
                } else if (parenthesisStack.peek().equals(OPEN_PARENTHESIS)) {
                    parenthesisStack.pop();
                }
            }
        }
        return parenthesisStack.size() == 0;
    }

}
