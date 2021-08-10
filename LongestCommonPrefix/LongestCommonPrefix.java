package algorithm_solutions.LeetCode.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = new String[] {"flower","flow","flight"};
		System.out.println("Longest Common Prefix: "+longestCommonPrefix(strs));
		
		strs = new String[]{"dog","racecar","car"};
		System.out.println("Longest Common Prefix: "+longestCommonPrefix(strs));
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		int rows = strs.length;
		// if size is 0, return empty string
		if (rows == 0)return ""; 
		/*if there is only one string in the array, then return the value of 
		the string*/
        if (rows == 1)return strs[0];
        
        // sort the array and find the length of the shortest one
        Arrays.sort(strs); 
        int columns = Math.min(strs[0].length(), strs[rows-1].length());
        
        String prefix = "";			
		int i=0;
		while (i < columns && strs[0].charAt(i) == strs[rows-1].charAt(i) ) {
            i++;
		}
		prefix = strs[0].substring(0,i);				
		return prefix;        
    }
	
	

}
