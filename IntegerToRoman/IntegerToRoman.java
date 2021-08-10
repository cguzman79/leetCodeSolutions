package algorithm_solutions.LeetCode.IntegerToRoman;

import java.util.ArrayList;

public class IntegerToRoman {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(n+" -> "+intToRoman(n));
		n = 4;
		System.out.println(n+" -> "+intToRoman(n));
		n = 9;
		System.out.println(n+" -> "+intToRoman(n));
		n = 58;
		System.out.println(n+" -> "+intToRoman(n));
		n = 1994;
		System.out.println(n+" -> "+intToRoman(n));
	}
	
	public static String intToRoman(int num) {
        String roman = "";
        int[] integer = toArray(num);
        int len = integer.length;
        StringBuilder builder = new StringBuilder();	        
        ArrayList<String> rom = new ArrayList<String>();
        
        for(int i=0;i<len;i++) {
        	int diff = (len-1)-i;
        	switch(integer[i]) {
        	case 0:        		
        		break;
        	case 1:
        		if(diff>0) {        			
        			switch(diff) {
        			case 3:
        				rom.add("M");
        				break;
        			case 2:
        				rom.add("C");
        				break;
        			case 1:
        				rom.add("X");
        				break;
        			}
        		}else {
        			rom.add("I");
        		}
        		break;
        	case 2:
        		if(diff>0) {        			
        			switch(diff) {
        			case 3:
        				rom.add("MM");
        				break;
        			case 2:
        				rom.add("CC");
        				break;
        			case 1:
        				rom.add("XX");
        				break;
        			}
        		}else {
        			rom.add("II");
        		}
        		break;
        	case 3:
        		if(diff>0) {        			
        			switch(diff) {
        			case 3:
        				rom.add("MMM");
        				break;
        			case 2:
        				rom.add("CCC");
        				break;
        			case 1:
        				rom.add("XXX");
        				break;
        			}
        		}else {
        			rom.add("III");
        		}
        		break;
        	case 4:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("CD");
        				break;
        			case 1:
        				rom.add("XL");
        				break;
        			}
        		}else {
        			rom.add("IV");
        		}
        		break;
        	case 5:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("D");
        				break;
        			case 1:
        				rom.add("L");
        				break;
        			}
        		}else {
        			rom.add("V");
        		}
        		break;
        	case 6:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("DC");
        				break;
        			case 1:
        				rom.add("LX");
        				break;
        			}
        		}else {
        			rom.add("VI");
        		}
        		break;
        	case 7:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("DCC");
        				break;
        			case 1:
        				rom.add("LXX");
        				break;
        			}
        		}else {
        			rom.add("VII");
        		}
        		break;
        	case 8:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("DCCC");
        				break;
        			case 1:
        				rom.add("LXXX");
        				break;
        			}
        		}else {
        			rom.add("VIII");
        		}
        		break;
        	case 9:
        		if(diff>0) {        			
        			switch(diff) {
        			case 2:
        				rom.add("CM");
        				break;
        			case 1:
        				rom.add("XC");
        				break;
        			}
        		}else {
        			rom.add("IX");
        		}
        		break;
        		
        	}
        }//end for.
        
        for(String r: rom) {
        	builder.append(r);
        }
        roman = builder.toString();
        return roman;
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
