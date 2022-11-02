package p20.validparenthese;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> parenthesisType = new HashMap<>();
        parenthesisType.put('(', ')');
        parenthesisType.put('[', ']');
        parenthesisType.put('{', '}');

        Stack<Character> parenthesisStack = new Stack<>();


        for (Character c : s.toCharArray()) {
            if (isPrefixParenthesis(parenthesisType, c)) {
                parenthesisStack.push(c);
            }
            if (isSuffixParenthesis(parenthesisType, c)) {
                if (parenthesisStack.isEmpty()) {
                    return false;
                }
                char matchedParenthesis = parenthesisStack.pop();
                if (!parenthesisType.get(matchedParenthesis).equals(c)) {
                    return false;
                }
            }
        }
        if (parenthesisStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isPrefixParenthesis(Map<Character, Character> parenthesisType, char c) {
        return parenthesisType.keySet().contains(c);
    }

    private boolean isSuffixParenthesis(Map<Character, Character> parenthesisType, char c) {
        return parenthesisType.values().contains(c);
    }

}
