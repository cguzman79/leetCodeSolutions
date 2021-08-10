package algorithm_solutions.LeetCode.ValidParenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "()";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "()[]{}";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "(]";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "([)]";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "{[]}";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "(([]){})";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
		s = "[({])}";
		System.out.println("Is a valid set of parenthesis: "+isValid(s));
	}
	
	public static boolean isValid(String s) {
		Map<Character, Character> pMap = new HashMap<Character, Character>();
		pMap.put('(', ')');
		pMap.put('{', '}');
		pMap.put('[', ']');

	    Stack<Character> parentheses = new Stack<Character>();
	    
	    for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if(pMap.containsKey(c)) {
	            parentheses.push(c);    
	        } else {
	            if(parentheses.isEmpty()) {
	                return false;
	            }
	            char target = parentheses.pop();
	            if(!pMap.containsKey(target) || pMap.get(target) != c) {
	                return false;
	            }
	        }
	    }
	    if(!parentheses.isEmpty()) {
	        return false;
	    }
	    return true;
	  }

}
