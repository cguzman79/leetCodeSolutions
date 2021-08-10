package algorithm_solutions.LeetCode.RomanToInteger;

public class RomanToInteger {

	public static void main(String[] args) {
		String n = "III";
		System.out.println(n+" -> "+romanToInt(n));
		n = "IV";
		System.out.println(n+" -> "+romanToInt(n));
		n = "IX";
		System.out.println(n+" -> "+romanToInt(n));
		n = "LVIII";
		System.out.println(n+" -> "+romanToInt(n));
		n = "MCMXCIV";
		System.out.println(n+" -> "+romanToInt(n));
	}
	
	public static int romanToInt(String s) {
	int num = 0;
	String[] roman = s.split("");
	int len = roman.length;
	String[] integer = new String[len];
	int[] nums = new int[len];
	
	for(int i=0;i<len;i++) {
		switch(roman[i]) {
		case "I":
			if(i!=len-1 && roman[i+1].equalsIgnoreCase("V")) {
				integer[i]="4";
				i++;
			}else if(i!=len-1 && roman[i+1].equalsIgnoreCase("X")) {
				integer[i]="9";
				i++;
			}else {
				integer[i] = "1";
			}			
			break;
		case "V":
			integer[i] = "5";
			break;
		case "X":
			if(i!=len-1 && roman[i+1].equalsIgnoreCase("L")) {
				integer[i]="40";
				i++;
			}else if(i!=len-1 && roman[i+1].equalsIgnoreCase("C")) {
					integer[i]="90";
					i++;
			}else {
					integer[i] = "10";
				}		
			break;
		case "L":
			integer[i] = "50";
			break;
		case "C":
			if(i!=len-1 && roman[i+1].equalsIgnoreCase("D")) {
				integer[i]="400";
				i++;
			}else if(i!=len-1 && roman[i+1].equalsIgnoreCase("M")) {
					integer[i]="900";
					i++;
			}else {
					integer[i] = "100";
				}
			break;
		case "D":
			integer[i] = "500";
			break;
		case "M":
			integer[i] = "1000";
			break;
		default:
			break;
		}
	}//end if.
	
	for(int i=0;i<integer.length;i++) {	
		nums[i]=Integer.valueOf(integer[i]!=null?integer[i]:"0");
	}//end for.
	for(int i=0;i<nums.length;i++) {
		num+=nums[i];
	}
	
		return num;
	}

}
