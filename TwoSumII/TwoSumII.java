package algorithm_solutions.LeetCode.TwoSumII;

public class TwoSumII {

	public static void main(String[] args) {
		int[] nums1 = new int[] {2,7,11,15};
		int[] result = new int[2];
		int target1 = 9;
		result=twoSum(nums1,target1);
		System.out.println("Elements: "+result[0]+" - "+result[1]);
		
		int[] nums2 = new int[] {2,3,4};
		int target2 = 6;
		result=twoSum(nums2,target2);
		System.out.println("Elements: "+result[0]+" - "+result[1]);
		
		int[] nums3 = new int[] {-1,0};
		int target3 = -1;
		result=twoSum(nums3,target3);
		System.out.println("Elements: "+result[0]+" - "+result[1]);

	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {				
				if(numbers[i]+numbers[j]==target) {
				solution[0]=i+1;
					solution[1]=j+1;
					return solution;
				}//end inner if.				
			}//end inner for.
		}//end for.		
		return solution;
    }

}
