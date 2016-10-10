package Leetcode;

import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean solution(String s){
    	Map<Character,Character> map=new HashMap<>();
    	map.put(')', '(');map.put(']', '[');map.put('}','{');
    	Stack<Character> stack=new Stack<>();
    	for(int i=0;i<s.length();i++){
    		char c=s.charAt(i);
    		if(c=='('||c=='['||c=='{')
    			stack.push(c);
    		else if(c==')'||c==']'||c=='}')
    			if(stack.isEmpty()) return false;
    			else if(stack.pop()!=map.get(c))
    				return false;
    	}
    	if(stack.isEmpty()) return true;
    	else return false;
    }
	public static void main(String[] args) {
      String string="()";
      System.out.println(solution(string));
	}

}
