package org.example;

import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {
        Valid_Parentheses obj = new Valid_Parentheses();
        String str = "(){}{}[]";
        System.out.println(obj.validPara(str));
    }
    public boolean validPara(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch == ')' && top != '(') return false;
                if(ch == '}' && top != '{') return false;
                if(ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
