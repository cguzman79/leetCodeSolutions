package algorithm_solutions.LeetCode.ReverseInteger;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 123;
		System.out.println("Original: "+x+"  Reversed: "+reverse(x));		
		x = -123;
		System.out.println("Original: "+x+"  Reversed: "+reverse(x));		
		x = 120;
		System.out.println("Original: "+x+"  Reversed: "+reverse(x));		
		x = 0;
		System.out.println("Original: "+x+"  Reversed: "+reverse(x));
		x = (int) 195864325487L;
		System.out.println("Original: "+x+"  Reversed: "+reverse(x));
	}	
	public static int reverse(int x) {
		int reverse = 0;
		String temp = String.valueOf(x);
		
			try {
				Integer.parseInt(temp);
				reverse=reverseInt(x);
			} catch (NumberFormatException e) {
				return 0;
			}
		
		return reverse;
	}
	
	public static int reverseInt(int x) {
			int solution = 0;
	        int len = 0;
	        StringBuilder builder = new StringBuilder();	        
	        int j = 0;	        
	        
	        if(x>=0) {
	        	len = (Integer.toString(x).length());
	        	int[] digits = toArray(x);
	        	int[] tempA = new int[len];
		        for(int i=0;i<len;i++) {
		        	tempA[j] = digits[i];
		        	j++;
		        }
		        tempA = flip(tempA);
		        
		        for (int num : tempA) {
		         builder.append(num);
		        }
		        solution = Integer.parseInt(builder.toString());
	        }else {
	        	len = (Integer.toString(x).length())-1;
	        	int[] digits = toArray(-x);
	        	int[] tempA = new int[len];
	        	
	        	for(int i=0;i<len;i++) {
		        	tempA[j] = digits[i];
		        	j++;
		        }
	        	tempA = flip(tempA);
		        
		        for (int num : tempA) {
		         builder.append(num);
		        }
		        solution = (Integer.parseInt(builder.toString()));
		        solution = -solution;
	        }
	        return solution;
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

	static int[] flip(int[] nums) {
		int len = nums.length;
		int[] newArray = new int[len];
		int j=len-1;
		for(int i=0; i< len;i++) {
			newArray[j] = nums[i];
			j--;
		}
		
		return newArray;
	}
}
