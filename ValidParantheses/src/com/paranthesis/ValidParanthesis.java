package com.paranthesis;

import java.util.Stack;

public class ValidParanthesis {
	
	
public boolean isValid(String s) {
	Stack<Character> leftSymbols = new Stack<>();
    // Loop for each character of the string
    for (char c : s.toCharArray()) {
        // If left symbol is encountered
        if (c == '(' || c == '{' || c == '[') {
            leftSymbols.push(c);
        }
        // If right symbol is encountered
        else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
            leftSymbols.pop();
        } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
            leftSymbols.pop();
        } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
            leftSymbols.pop();
        }
        // If none of the valid symbols is encountered
        else {
            return false;
        }
    }
    return leftSymbols.isEmpty();
    }

public static void main(String args[])
{
	ValidParanthesis v = new ValidParanthesis();
boolean val =v.isValid("(][]{}");

System.out.println(val);
}

}
