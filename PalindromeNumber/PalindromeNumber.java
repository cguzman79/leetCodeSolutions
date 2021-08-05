package algorithm_solutions.LeetCode.PalindromeNumber;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
		x = -121;
		System.out.println(isPalindrome(x));
		x = 10;
		System.out.println(isPalindrome(x));
		x = -101;
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
		boolean isPalindrome = true;
		int[] number = toArray(x);
		int i = 0;
		int j = number.length-1;
		if(x<0) {return false;}
		while(isPalindrome&&(j>i)) {		
			if(number[i]!=number[j]) {return false;}	
			i++;j--;	
		}	
		return isPalindrome;
    }
	
	static int[] toArray(int x) 
	{ 
		int i = 0; 
		int len = Integer.toString(x).length(); 
		int[] nums = new int[len]; 
		while(x!=0) 
		{ 
			nums[len-i-1] = x%10; 
			x=x/10; 
			i++; 
		} 
		return nums; 
	} 

}
