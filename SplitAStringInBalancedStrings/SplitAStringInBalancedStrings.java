package algorithm_solutions.LeetCode.SplitAStringInBalancedStrings;

public class SplitAStringInBalancedStrings {

	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println("Number of balanced strings: "+balancedStringSplit(s));
		s = "RLLLLRRRLR";
		System.out.println("Number of balanced strings: "+balancedStringSplit(s));
		s = "LLLLRRRR";
		System.out.println("Number of balanced strings: "+balancedStringSplit(s));
		s = "RLRRRLLRLL";
		System.out.println("Number of balanced strings: "+balancedStringSplit(s));
	}
	
	public static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) == 'L') count++;
        	else count--;
        	if(count==0) result++;        	
        }        
        return result;
    }

}
